package com.moeezasapplication.app.modules.passwordchanged.`data`.model

import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PasswordChangedModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPasswordChange: String? =
      MyApp.getInstance().resources.getString(R.string.msg_password_change)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYourpasswordh: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_password_h)

)
