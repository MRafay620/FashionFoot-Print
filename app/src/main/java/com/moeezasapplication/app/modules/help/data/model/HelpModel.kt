package com.moeezasapplication.app.modules.help.`data`.model

import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HelpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHelpSupport: String? = MyApp.getInstance().resources.getString(R.string.lbl_help_support)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAboutus: String? = MyApp.getInstance().resources.getString(R.string.lbl_about_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrivacyPolic: String? = MyApp.getInstance().resources.getString(R.string.msg_privacy_polic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTermConditio: String? = MyApp.getInstance().resources.getString(R.string.msg_term_conditio)

)
