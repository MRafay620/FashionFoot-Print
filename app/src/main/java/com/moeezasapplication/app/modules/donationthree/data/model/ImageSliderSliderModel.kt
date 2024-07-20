package com.moeezasapplication.app.modules.donationthree.`data`.model

import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ImageSliderSliderModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtButton: String? = MyApp.getInstance().resources.getString(R.string.lbl_make_a_donation)

)
