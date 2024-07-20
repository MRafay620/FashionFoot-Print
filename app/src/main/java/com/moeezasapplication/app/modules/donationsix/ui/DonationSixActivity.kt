package com.moeezasapplication.app.modules.donationsix.ui

import android.content.Intent
import androidx.activity.viewModels
import androidx.appcompat.widget.AppCompatButton
import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.base.BaseActivity
import com.moeezasapplication.app.databinding.ActivityDonationSixBinding
import com.moeezasapplication.app.modules.donationone.ui.DonationOneActivity
import com.moeezasapplication.app.modules.donationsix.`data`.viewmodel.DonationSixVM
import com.moeezasapplication.app.modules.donationthree.ui.DonationThreeActivity
import com.moeezasapplication.app.modules.welcome.ui.WelcomeActivity
import kotlin.String
import kotlin.Unit

class DonationSixActivity : BaseActivity<ActivityDonationSixBinding>(R.layout.activity_donation_six)
    {
  private val viewModel: DonationSixVM by viewModels<DonationSixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.donationSixVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    val btnYouAreWelcomeOne = findViewById<AppCompatButton>(R.id.btnYouAreWelcomeOne)
    btnYouAreWelcomeOne.setOnClickListener {
      val intent = Intent(this, DonationOneActivity::class.java)
      startActivity(intent)
    }
  }

  companion object {
    const val TAG: String = "DONATION_SIX_ACTIVITY"

  }
}
