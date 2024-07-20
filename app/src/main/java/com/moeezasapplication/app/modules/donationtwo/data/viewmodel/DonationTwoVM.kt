package com.moeezasapplication.app.modules.donationtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.moeezasapplication.app.modules.donationtwo.`data`.model.DonationTwoModel
import org.koin.core.KoinComponent

class DonationTwoVM : ViewModel(), KoinComponent {
  val donationTwoModel: MutableLiveData<DonationTwoModel> = MutableLiveData(DonationTwoModel())

  var navArguments: Bundle? = null
}
