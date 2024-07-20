package com.moeezasapplication.app.modules.landingpage.`data`.model

import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LandingPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFashionFootpri: String? =
      MyApp.getInstance().resources.getString(R.string.msg_fashion_footpri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouronestops: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_one_stop_s)

)
