package com.moeezasapplication.app.modules.donationtwo.ui

import android.content.Intent
import android.widget.ImageView
import androidx.activity.viewModels
import androidx.appcompat.widget.AppCompatButton
import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.base.BaseActivity
import com.moeezasapplication.app.databinding.ActivityDonationTwoBinding
import com.moeezasapplication.app.modules.donationfive.ui.DonationFiveActivity
import com.moeezasapplication.app.modules.donationtwo.`data`.viewmodel.DonationTwoVM
import com.moeezasapplication.app.modules.landingpage.ui.LandingPageActivity
import com.moeezasapplication.app.modules.sidebar.ui.SidebarActivity
import kotlin.String
import kotlin.Unit

class DonationTwoActivity : BaseActivity<ActivityDonationTwoBinding>(R.layout.activity_donation_two) {
  private val viewModel: DonationTwoVM by viewModels<DonationTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.donationTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    val btnMakeADonationOne = findViewById<AppCompatButton>(R.id.btnMakeADonationOne)
    btnMakeADonationOne.setOnClickListener {
      val intent = Intent(this, DonationFiveActivity::class.java)
      startActivity(intent)
    }
    val imageMenu = findViewById<ImageView>(R.id.imageMenu)
    imageMenu.setOnClickListener {
      val intent = Intent(this, SidebarActivity::class.java)
      startActivity(intent)
    }
  }



  companion object {
    const val TAG: String = "DONATION_TWO_ACTIVITY"
  }
}
