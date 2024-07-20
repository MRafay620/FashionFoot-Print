package com.moeezasapplication.app.modules.termc.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.moeezasapplication.app.modules.termc.`data`.model.TermcModel
import org.koin.core.KoinComponent

class TermcVM : ViewModel(), KoinComponent {
  val termcModel: MutableLiveData<TermcModel> = MutableLiveData(TermcModel())

  var navArguments: Bundle? = null
}
