package com.moeezasapplication.app.modules.termc.ui

import androidx.activity.viewModels
import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.base.BaseActivity
import com.moeezasapplication.app.databinding.ActivityTermcBinding
import com.moeezasapplication.app.modules.termc.`data`.viewmodel.TermcVM
import kotlin.String
import kotlin.Unit

class TermcActivity : BaseActivity<ActivityTermcBinding>(R.layout.activity_termc) {
  private val viewModel: TermcVM by viewModels<TermcVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.termcVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "TERMC_ACTIVITY"

  }
}
