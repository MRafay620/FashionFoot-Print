package com.moeezasapplication.app.modules.passwordchanged.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.moeezasapplication.app.modules.passwordchanged.`data`.model.PasswordChangedModel
import org.koin.core.KoinComponent

class PasswordChangedVM : ViewModel(), KoinComponent {
  val passwordChangedModel: MutableLiveData<PasswordChangedModel> =
      MutableLiveData(PasswordChangedModel())

  var navArguments: Bundle? = null
}
