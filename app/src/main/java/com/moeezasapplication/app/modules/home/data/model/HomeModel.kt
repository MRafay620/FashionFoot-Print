package com.moeezasapplication.app.modules.home.`data`.model

import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGoodEvening: String? = MyApp.getInstance().resources.getString(R.string.lbl_good_evening)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmmanuel: String? = MyApp.getInstance().resources.getString(R.string.lbl_emmanuel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSummerCollecti: String? =
      MyApp.getInstance().resources.getString(R.string.msg_summer_collecti)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWinterCollecti: String? =
      MyApp.getInstance().resources.getString(R.string.msg_winter_collecti)

)
