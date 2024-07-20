package com.moeezasapplication.app.modules.aboutus.`data`.model

import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AboutusModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAboutus: String? = MyApp.getInstance().resources.getString(R.string.lbl_about_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_this_platform_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_copyright_s19_m)

)
