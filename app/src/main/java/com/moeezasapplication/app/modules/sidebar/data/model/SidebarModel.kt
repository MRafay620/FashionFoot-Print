package com.moeezasapplication.app.modules.sidebar.`data`.model

import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SidebarModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFashion: String? = MyApp.getInstance().resources.getString(R.string.lbl_fashion)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFootprint: String? = MyApp.getInstance().resources.getString(R.string.lbl_footprint)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccount: String? = MyApp.getInstance().resources.getString(R.string.lbl_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDonateClothes: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_donate_clothes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInviteAFriend: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_invite_a_friend)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReportAProble: String? =
      MyApp.getInstance().resources.getString(R.string.msg_report_a_proble)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAppearance: String? = MyApp.getInstance().resources.getString(R.string.lbl_appearance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelpSupport: String? = MyApp.getInstance().resources.getString(R.string.lbl_help_support)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSettingsTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)

)
