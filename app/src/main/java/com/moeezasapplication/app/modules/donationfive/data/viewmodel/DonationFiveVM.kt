package com.moeezasapplication.app.modules.donationfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.moeezasapplication.app.modules.donationfive.`data`.model.DonationFiveModel
import com.moeezasapplication.app.modules.donationfive.`data`.model.SpinnerTextFieldOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DonationFiveVM : ViewModel(), KoinComponent {
  val donationFiveModel: MutableLiveData<DonationFiveModel> = MutableLiveData(DonationFiveModel())

  var navArguments: Bundle? = null

  val spinnerTextFieldOneList: MutableLiveData<MutableList<SpinnerTextFieldOneModel>> =
      MutableLiveData()
}
