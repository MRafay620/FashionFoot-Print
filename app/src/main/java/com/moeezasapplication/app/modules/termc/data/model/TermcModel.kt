package com.moeezasapplication.app.modules.termc.`data`.model

import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TermcModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTermConditio: String? = MyApp.getInstance().resources.getString(R.string.msg_term_conditio)
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
