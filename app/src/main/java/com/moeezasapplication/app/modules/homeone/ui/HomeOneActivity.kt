package com.moeezasapplication.app.modules.homeone.ui

import android.content.Intent
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.viewModels
import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.base.BaseActivity
import com.moeezasapplication.app.databinding.ActivityHomeOneBinding
import com.moeezasapplication.app.modules.closetmain.ui.ClosetMainActivity
import com.moeezasapplication.app.modules.donationtwo.ui.DonationTwoActivity
import com.moeezasapplication.app.modules.home.ui.HomeActivity
import com.moeezasapplication.app.modules.homeone.`data`.viewmodel.HomeOneVM
import com.moeezasapplication.app.modules.sidebar.ui.SidebarActivity
import kotlin.String
import kotlin.Unit

class HomeOneActivity : BaseActivity<ActivityHomeOneBinding>(R.layout.activity_home_one) {
  private val viewModel: HomeOneVM by viewModels<HomeOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    val imageMenu = findViewById<ImageView>(R.id.imageMenu)
    imageMenu.setOnClickListener {
      val intent = Intent(this, SidebarActivity::class.java)
      startActivity(intent)
    }
    val linearColumnsend = findViewById<LinearLayout>(R.id.linearColumnsend)
    linearColumnsend.setOnClickListener {
      val intent = Intent(this, HomeActivity::class.java)
      startActivity(intent)
    }
    val linearColumnmusic = findViewById<LinearLayout>(R.id.linearColumnmusic)
    linearColumnmusic.setOnClickListener {
      val intent = Intent(this, DonationTwoActivity::class.java)
      startActivity(intent)
    }
  }

  companion object {
    const val TAG: String = "HOME_ONE_ACTIVITY"

  }
}
