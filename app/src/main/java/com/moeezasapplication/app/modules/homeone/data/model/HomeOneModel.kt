package com.moeezasapplication.app.modules.homeone.`data`.model

import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGoodEvening: String? = MyApp.getInstance().resources.getString(R.string.lbl_good_evening)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmmanuel: String? = MyApp.getInstance().resources.getString(R.string.lbl_emmanuel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSwipetotaket: String? =
      MyApp.getInstance().resources.getString(R.string.msg_swipe_to_take_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcometoDoNa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_to_dona)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloEmmanuel: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hello_emmanuel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWardrobe: String? = MyApp.getInstance().resources.getString(R.string.lbl_wardrobe)
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
  var txtChallenges: String? = MyApp.getInstance().resources.getString(R.string.lbl_challenges)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReminder: String? = MyApp.getInstance().resources.getString(R.string.lbl_reminder)

)
