package com.moeezasapplication.app.modules.createnewpassword.`data`.model

import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CreateNewPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomebackG: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_new_pass)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeZone: String? = MyApp.getInstance().resources.getString(R.string.msg_your_new_passwo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etNewPasswordIValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etConfirmPassworValue: String? = null
)
