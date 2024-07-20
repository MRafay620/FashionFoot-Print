package com.moeezasapplication.app.modules.sidebar.ui

import android.content.Intent
import android.widget.LinearLayout
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.AppCompatButton
import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.base.BaseActivity
import com.moeezasapplication.app.databinding.ActivitySidebarBinding
import com.moeezasapplication.app.modules.donationfive.ui.DonationFiveActivity
import com.moeezasapplication.app.modules.donationtwo.ui.DonationTwoActivity
import com.moeezasapplication.app.modules.help.ui.HelpActivity
import com.moeezasapplication.app.modules.sidebar.`data`.viewmodel.SidebarVM
import kotlin.String
import kotlin.Unit

class SidebarActivity : BaseActivity<ActivitySidebarBinding>(R.layout.activity_sidebar) {
  private val viewModel: SidebarVM by viewModels<SidebarVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.sidebarVM = viewModel
  }

  override fun setUpClicks(): Unit {
    val linearRowstar = findViewById<LinearLayout>(R.id.linearRowstar)
    linearRowstar.setOnClickListener {
      val intent = Intent(this, DonationTwoActivity::class.java)
      startActivity(intent)
    }
    val linearRowicbaselinesup = findViewById<LinearLayout>(R.id.linearRowicbaselinesup)
    linearRowicbaselinesup.setOnClickListener {
      val intent = Intent(this, HelpActivity::class.java)
      startActivity(intent)
    }
    val linearRowapperanceicon = findViewById<LinearLayout>(R.id.linearRowapperanceicon)
    linearRowapperanceicon.setOnClickListener {
      AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
      recreate()
    }
  }

  companion object {
    const val TAG: String = "SIDEBAR_ACTIVITY"

  }
}
