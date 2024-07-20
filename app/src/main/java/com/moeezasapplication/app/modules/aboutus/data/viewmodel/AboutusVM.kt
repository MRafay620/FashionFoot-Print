package com.moeezasapplication.app.modules.aboutus.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.moeezasapplication.app.modules.aboutus.`data`.model.AboutusModel
import org.koin.core.KoinComponent

class AboutusVM : ViewModel(), KoinComponent {
  val aboutusModel: MutableLiveData<AboutusModel> = MutableLiveData(AboutusModel())

  var navArguments: Bundle? = null
}
