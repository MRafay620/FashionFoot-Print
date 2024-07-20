package com.moeezasapplication.app.modules.aboutus.ui

import androidx.activity.viewModels
import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.base.BaseActivity
import com.moeezasapplication.app.databinding.ActivityAboutusBinding
import com.moeezasapplication.app.modules.aboutus.`data`.viewmodel.AboutusVM
import kotlin.String
import kotlin.Unit

class AboutusActivity : BaseActivity<ActivityAboutusBinding>(R.layout.activity_aboutus) {
  private val viewModel: AboutusVM by viewModels<AboutusVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.aboutusVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "ABOUTUS_ACTIVITY"

  }
}
