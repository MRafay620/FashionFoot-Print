package com.moeezasapplication.app.modules.donation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.moeezasapplication.app.modules.donation.`data`.model.DonationModel
import com.moeezasapplication.app.modules.donation.`data`.model.SpinnerTextFieldOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DonationVM : ViewModel(), KoinComponent {
  val donationModel: MutableLiveData<DonationModel> = MutableLiveData(DonationModel())

  var navArguments: Bundle? = null

  val spinnerTextFieldOneList: MutableLiveData<MutableList<SpinnerTextFieldOneModel>> =
      MutableLiveData()
}
