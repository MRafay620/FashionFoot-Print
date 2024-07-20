package com.moeezasapplication.app.modules.closet.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.moeezasapplication.app.modules.closet.`data`.model.ClosetModel
import org.koin.core.KoinComponent

class ClosetVM : ViewModel(), KoinComponent {
  val closetModel: MutableLiveData<ClosetModel> = MutableLiveData(ClosetModel())

  var navArguments: Bundle? = null
}
