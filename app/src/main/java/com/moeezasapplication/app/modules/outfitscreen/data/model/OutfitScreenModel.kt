package com.moeezasapplication.app.modules.outfitscreen.`data`.model

import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OutfitScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeresSuggesti: String? =
      MyApp.getInstance().resources.getString(R.string.msg_here_s_suggesti)

)
