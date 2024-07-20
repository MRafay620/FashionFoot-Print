package com.moeezasapplication.app.modules.donationone.`data`.model

import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DonationOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGenericDonatin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_generic_donatin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_mins_ago)

)
