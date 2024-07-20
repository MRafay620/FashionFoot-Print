package com.moeezasapplication.app.modules.outfitscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.moeezasapplication.app.modules.outfitscreen.`data`.model.OutfitScreenModel
import org.koin.core.KoinComponent

class OutfitScreenVM : ViewModel(), KoinComponent {
  val outfitScreenModel: MutableLiveData<OutfitScreenModel> = MutableLiveData(OutfitScreenModel())

  var navArguments: Bundle? = null
}
