package com.moeezasapplication.app.modules.closet.`data`.model

import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ClosetModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMyCloset: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_closet)

)
