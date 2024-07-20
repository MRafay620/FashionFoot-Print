package com.moeezasapplication.app.modules.donationfour.`data`.model

import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DonationFourModel(
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
  var txtButton: String? = MyApp.getInstance().resources.getString(R.string.lbl_make_a_donation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTakeAPictureOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_take_a_picture)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTakeAVideo: String? = MyApp.getInstance().resources.getString(R.string.lbl_take_a_video)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectfromGal: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_from_gal)
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
