package com.moeezasapplication.app.modules.forgotpassword.`data`.model

import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ForgotPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomebackG: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDontworryIt: String? = MyApp.getInstance().resources.getString(R.string.msg_don_t_worry_it)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRememberPasswo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_remember_passwo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEnteryouremaiValue: String? = null
)
