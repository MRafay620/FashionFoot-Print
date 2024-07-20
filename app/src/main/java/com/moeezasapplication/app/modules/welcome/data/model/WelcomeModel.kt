package com.moeezasapplication.app.modules.welcome.`data`.model

import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class WelcomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcometo: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFashionFootpri: String? =
      MyApp.getInstance().resources.getString(R.string.msg_fashion_footpri)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsBeginYou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_begin_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContinueasag: String? =
      MyApp.getInstance().resources.getString(R.string.msg_continue_as_a_g)

)
