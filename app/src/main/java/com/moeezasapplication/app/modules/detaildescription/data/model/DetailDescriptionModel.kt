package com.moeezasapplication.app.modules.detaildescription.`data`.model

import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DetailDescriptionModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCasualWear: String? = MyApp.getInstance().resources.getString(R.string.lbl_casual_wear)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAboutOutfit: String? = MyApp.getInstance().resources.getString(R.string.lbl_about_outfit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_these_soft_cak)

)
