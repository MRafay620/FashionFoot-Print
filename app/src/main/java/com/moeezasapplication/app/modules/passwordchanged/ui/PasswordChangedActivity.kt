package com.moeezasapplication.app.modules.passwordchanged.ui

import androidx.activity.viewModels
import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.base.BaseActivity
import com.moeezasapplication.app.databinding.ActivityPasswordChangedBinding
import com.moeezasapplication.app.modules.passwordchanged.`data`.viewmodel.PasswordChangedVM
import kotlin.String
import kotlin.Unit

class PasswordChangedActivity :
    BaseActivity<ActivityPasswordChangedBinding>(R.layout.activity_password_changed) {
  private val viewModel: PasswordChangedVM by viewModels<PasswordChangedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.passwordChangedVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PASSWORD_CHANGED_ACTIVITY"

  }
}
