package com.moeezasapplication.app.modules.donationsix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.moeezasapplication.app.modules.donationsix.`data`.model.DonationSixModel
import org.koin.core.KoinComponent

class DonationSixVM : ViewModel(), KoinComponent {
  val donationSixModel: MutableLiveData<DonationSixModel> = MutableLiveData(DonationSixModel())

  var navArguments: Bundle? = null
}
