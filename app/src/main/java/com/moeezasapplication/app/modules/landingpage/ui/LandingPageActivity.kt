package com.moeezasapplication.app.modules.landingpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.AppCompatButton
import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.base.BaseActivity
import com.moeezasapplication.app.databinding.ActivityLandingPageBinding
import com.moeezasapplication.app.modules.landingpage.`data`.viewmodel.LandingPageVM
import com.moeezasapplication.app.modules.welcome.ui.WelcomeActivity
import kotlin.String
import kotlin.Unit

class LandingPageActivity : BaseActivity<ActivityLandingPageBinding>(R.layout.activity_landing_page)
    {
  private val viewModel: LandingPageVM by viewModels<LandingPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.landingPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    val btnGetStarted = findViewById<AppCompatButton>(R.id.btnGetStarted)
    btnGetStarted.setOnClickListener {
      val intent = Intent(this, WelcomeActivity::class.java)
      startActivity(intent)
    }
  }

  companion object {
    const val TAG: String = "LANDING_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LandingPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
