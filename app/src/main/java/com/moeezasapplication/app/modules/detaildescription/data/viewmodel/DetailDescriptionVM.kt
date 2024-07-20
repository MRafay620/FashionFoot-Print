package com.moeezasapplication.app.modules.detaildescription.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.moeezasapplication.app.modules.detaildescription.`data`.model.DetailDescriptionModel
import org.koin.core.KoinComponent

class DetailDescriptionVM : ViewModel(), KoinComponent {
  val detailDescriptionModel: MutableLiveData<DetailDescriptionModel> =
      MutableLiveData(DetailDescriptionModel())

  var navArguments: Bundle? = null
}
