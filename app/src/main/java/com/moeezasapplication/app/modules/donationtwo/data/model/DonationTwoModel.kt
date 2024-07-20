package com.moeezasapplication.app.modules.donationtwo.`data`.model

import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DonationTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtClothDonation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_cloth_donation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNoClothesDona: String? =
      MyApp.getInstance().resources.getString(R.string.msg_no_clothes_dona)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouhaventmad: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_haven_t_mad)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDonateCashIns: String? =
      MyApp.getInstance().resources.getString(R.string.msg_donate_cash_ins)

)
