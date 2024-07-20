package com.moeezasapplication.app.modules.createnewpassword.ui

import androidx.activity.viewModels
import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.base.BaseActivity
import com.moeezasapplication.app.databinding.ActivityCreateNewPasswordBinding
import com.moeezasapplication.app.modules.createnewpassword.`data`.viewmodel.CreateNewPasswordVM
import kotlin.String
import kotlin.Unit

class CreateNewPasswordActivity :
    BaseActivity<ActivityCreateNewPasswordBinding>(R.layout.activity_create_new_password) {
  private val viewModel: CreateNewPasswordVM by viewModels<CreateNewPasswordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.createNewPasswordVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CREATE_NEW_PASSWORD_ACTIVITY"

  }
}
