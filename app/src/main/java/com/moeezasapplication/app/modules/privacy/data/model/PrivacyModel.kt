package com.moeezasapplication.app.modules.privacy.`data`.model

import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PrivacyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPrivacyPolic: String? = MyApp.getInstance().resources.getString(R.string.msg_privacy_polic)
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
