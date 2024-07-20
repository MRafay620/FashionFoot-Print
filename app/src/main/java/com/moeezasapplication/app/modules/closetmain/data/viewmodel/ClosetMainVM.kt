package com.moeezasapplication.app.modules.closetmain.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.moeezasapplication.app.modules.closetmain.`data`.model.ClosetMainModel
import org.koin.core.KoinComponent

class ClosetMainVM : ViewModel(), KoinComponent {
  val closetMainModel: MutableLiveData<ClosetMainModel> = MutableLiveData(ClosetMainModel())

  var navArguments: Bundle? = null
}
