package com.moeezasapplication.app.modules.closet.ui

import androidx.activity.viewModels
import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.base.BaseActivity
import com.moeezasapplication.app.databinding.ActivityClosetBinding
import com.moeezasapplication.app.modules.closet.`data`.viewmodel.ClosetVM
import kotlin.String
import kotlin.Unit

class ClosetActivity : BaseActivity<ActivityClosetBinding>(R.layout.activity_closet) {
  private val viewModel: ClosetVM by viewModels<ClosetVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.closetVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CLOSET_ACTIVITY"

  }
}
