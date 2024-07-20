package com.moeezasapplication.app.modules.sidebar.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.moeezasapplication.app.modules.sidebar.`data`.model.SidebarModel
import org.koin.core.KoinComponent

class SidebarVM : ViewModel(), KoinComponent {
  val sidebarModel: MutableLiveData<SidebarModel> = MutableLiveData(SidebarModel())

  var navArguments: Bundle? = null
}
