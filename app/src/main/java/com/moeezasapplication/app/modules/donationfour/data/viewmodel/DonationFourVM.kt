package com.moeezasapplication.app.modules.donationfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.moeezasapplication.app.modules.donationfour.`data`.model.DonationFourModel
import com.moeezasapplication.app.modules.donationfour.`data`.model.SpinnerTextFieldOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DonationFourVM : ViewModel(), KoinComponent {
  val donationFourModel: MutableLiveData<DonationFourModel> = MutableLiveData(DonationFourModel())

  var navArguments: Bundle? = null

  val spinnerTextFieldOneList: MutableLiveData<MutableList<SpinnerTextFieldOneModel>> =
      MutableLiveData()
}
