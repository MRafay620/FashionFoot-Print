package com.moeezasapplication.app.modules.detaildescription.ui

import androidx.activity.viewModels
import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.base.BaseActivity
import com.moeezasapplication.app.databinding.ActivityDetailDescriptionBinding
import com.moeezasapplication.app.modules.detaildescription.`data`.viewmodel.DetailDescriptionVM
import kotlin.String
import kotlin.Unit

class DetailDescriptionActivity :
    BaseActivity<ActivityDetailDescriptionBinding>(R.layout.activity_detail_description) {
  private val viewModel: DetailDescriptionVM by viewModels<DetailDescriptionVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.detailDescriptionVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "DETAIL_DESCRIPTION_ACTIVITY"

  }
}
