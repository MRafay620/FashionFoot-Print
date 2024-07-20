package com.moeezasapplication.app.modules.donationone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.moeezasapplication.app.modules.donationone.`data`.model.DonationOneModel
import com.moeezasapplication.app.modules.donationone.`data`.model.DonationOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DonationOneVM : ViewModel(), KoinComponent {
  val donationOneModel: MutableLiveData<DonationOneModel> = MutableLiveData(DonationOneModel())

  var navArguments: Bundle? = null

  val donationOneList: MutableLiveData<MutableList<DonationOneRowModel>> =
      MutableLiveData(mutableListOf())
}
