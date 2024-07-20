package com.moeezasapplication.app.modules.donationsix.`data`.model

import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DonationSixModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHurrayYoujus: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hurray_you_jus)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourdonatedit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_donated_it)

)
