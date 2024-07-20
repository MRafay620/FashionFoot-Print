package com.moeezasapplication.app.modules.outfitscreen.ui

import androidx.activity.viewModels
import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.base.BaseActivity
import com.moeezasapplication.app.databinding.ActivityOutfitScreenBinding
import com.moeezasapplication.app.modules.outfitscreen.`data`.viewmodel.OutfitScreenVM
import kotlin.String
import kotlin.Unit

class OutfitScreenActivity :
    BaseActivity<ActivityOutfitScreenBinding>(R.layout.activity_outfit_screen) {
  private val viewModel: OutfitScreenVM by viewModels<OutfitScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.outfitScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "OUTFIT_SCREEN_ACTIVITY"

  }
}
