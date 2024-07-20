package com.moeezasapplication.app.modules.homeone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.moeezasapplication.app.modules.homeone.`data`.model.HomeOneModel
import org.koin.core.KoinComponent

class HomeOneVM : ViewModel(), KoinComponent {
  val homeOneModel: MutableLiveData<HomeOneModel> = MutableLiveData(HomeOneModel())

  var navArguments: Bundle? = null
}
