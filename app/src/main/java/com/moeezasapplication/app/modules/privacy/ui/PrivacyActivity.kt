package com.moeezasapplication.app.modules.privacy.ui

import androidx.activity.viewModels
import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.base.BaseActivity
import com.moeezasapplication.app.databinding.ActivityPrivacyBinding
import com.moeezasapplication.app.modules.privacy.`data`.viewmodel.PrivacyVM
import kotlin.String
import kotlin.Unit

class PrivacyActivity : BaseActivity<ActivityPrivacyBinding>(R.layout.activity_privacy) {
  private val viewModel: PrivacyVM by viewModels<PrivacyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.privacyVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PRIVACY_ACTIVITY"

  }
}
