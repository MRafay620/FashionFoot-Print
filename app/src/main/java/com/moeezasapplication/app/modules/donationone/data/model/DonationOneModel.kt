package com.moeezasapplication.app.modules.donationone.`data`.model

import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DonationOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtClothDonation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_cloth_donation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDonate: String? = MyApp.getInstance().resources.getString(R.string.lbl_donate)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrame246: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_donations)

)
