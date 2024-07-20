package com.moeezasapplication.app.modules.donation.ui

import androidx.activity.viewModels
import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.base.BaseActivity
import com.moeezasapplication.app.databinding.ActivityDonationBinding
import com.moeezasapplication.app.modules.donation.`data`.model.SpinnerTextFieldOneModel
import com.moeezasapplication.app.modules.donation.`data`.viewmodel.DonationVM
import kotlin.String
import kotlin.Unit

class DonationActivity : BaseActivity<ActivityDonationBinding>(R.layout.activity_donation) {
  private val viewModel: DonationVM by viewModels<DonationVM>()

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
    binding.donationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "DONATION_ACTIVITY"

  }
}
