package com.moeezasapplication.app.modules.donationthree.`data`.model

import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DonationThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDonateClothes: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_donate_clothes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWouldyoulike: String? =
      MyApp.getInstance().resources.getString(R.string.msg_would_you_like)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTakeapicture: String? =
      MyApp.getInstance().resources.getString(R.string.msg_take_a_picture)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProcessingDona: String? =
      MyApp.getInstance().resources.getString(R.string.msg_processing_dona)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etTextFieldValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etTextareaValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etTextareaOneValue: String? = null
)
