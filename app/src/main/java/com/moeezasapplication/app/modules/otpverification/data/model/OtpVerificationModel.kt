package com.moeezasapplication.app.modules.otpverification.`data`.model

import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OtpVerificationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcomebackG: String? =
      MyApp.getInstance().resources.getString(R.string.msg_otp_verificatio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEntertheverif: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_the_verif)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDidntreceived: String? =
      MyApp.getInstance().resources.getString(R.string.msg_didn_t_received)

)
