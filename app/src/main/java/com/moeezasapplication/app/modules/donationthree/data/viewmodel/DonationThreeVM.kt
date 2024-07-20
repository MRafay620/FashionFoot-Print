package com.moeezasapplication.app.modules.donationthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.moeezasapplication.app.modules.donationthree.`data`.model.DonationThreeModel
import com.moeezasapplication.app.modules.donationthree.`data`.model.SpinnerTextFieldOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DonationThreeVM : ViewModel(), KoinComponent {
  val donationThreeModel: MutableLiveData<DonationThreeModel> =
      MutableLiveData(DonationThreeModel())

  var navArguments: Bundle? = null

  val spinnerTextFieldOneList: MutableLiveData<MutableList<SpinnerTextFieldOneModel>> =
      MutableLiveData()
}
