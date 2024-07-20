package com.moeezasapplication.app.modules.donationfour.ui

import android.content.Intent
import androidx.activity.viewModels
import androidx.appcompat.widget.AppCompatButton
import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.base.BaseActivity
import com.moeezasapplication.app.databinding.ActivityDonationFourBinding
import com.moeezasapplication.app.modules.donationfour.`data`.model.SpinnerTextFieldOneModel
import com.moeezasapplication.app.modules.donationfour.`data`.viewmodel.DonationFourVM
import com.moeezasapplication.app.modules.donationtwo.ui.DonationTwoActivity
import com.moeezasapplication.app.modules.welcome.ui.WelcomeActivity
import kotlin.String
import kotlin.Unit

class DonationFourActivity :
    BaseActivity<ActivityDonationFourBinding>(R.layout.activity_donation_four) {
  private val viewModel: DonationFourVM by viewModels<DonationFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerTextFieldOneList.value = mutableListOf(
    SpinnerTextFieldOneModel("Item1"),
    SpinnerTextFieldOneModel("Item2"),
    SpinnerTextFieldOneModel("Item3"),
    SpinnerTextFieldOneModel("Item4"),
    SpinnerTextFieldOneModel("Item5")
    )
    val spinnerTextFieldOneAdapter =
    SpinnerTextFieldOneAdapter(this,R.layout.spinner_item,viewModel.spinnerTextFieldOneList.value?:
    mutableListOf())
    binding.spinnerTextFieldOne.adapter = spinnerTextFieldOneAdapter
    binding.donationFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }

  }

  companion object {
    const val TAG: String = "DONATION_FOUR_ACTIVITY"

  }
}
