package com.moeezasapplication.app.modules.closetmain.`data`.model

import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ClosetMainModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCategories: String? = MyApp.getInstance().resources.getString(R.string.lbl_categories)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_jackets)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEnteryourpassValue: String? = null
)
