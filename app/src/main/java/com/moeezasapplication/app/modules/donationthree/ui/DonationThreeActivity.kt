package com.moeezasapplication.app.modules.donationthree.ui

import androidx.activity.viewModels
import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.base.BaseActivity
import com.moeezasapplication.app.databinding.ActivityDonationThreeBinding
import com.moeezasapplication.app.modules.donationthree.`data`.model.ImageSliderSliderModel
import com.moeezasapplication.app.modules.donationthree.`data`.model.SpinnerTextFieldOneModel
import com.moeezasapplication.app.modules.donationthree.`data`.viewmodel.DonationThreeVM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class DonationThreeActivity :
    BaseActivity<ActivityDonationThreeBinding>(R.layout.activity_donation_three) {
  private val imageSliderSliderItems: ArrayList<ImageSliderSliderModel> = arrayListOf()


  private val viewModel: DonationThreeVM by viewModels<DonationThreeVM>()

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
    val sliderAdapter = SliderAdapter(imageSliderSliderItems,true)
    binding.imageSliderSlider.adapter = sliderAdapter
    binding.donationThreeVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSlider.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSlider.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "DONATION_THREE_ACTIVITY"

  }
}
