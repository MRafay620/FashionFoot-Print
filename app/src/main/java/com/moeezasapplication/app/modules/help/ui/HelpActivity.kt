package com.moeezasapplication.app.modules.help.ui

import android.content.Intent
import android.widget.LinearLayout
import androidx.activity.viewModels
import androidx.appcompat.widget.AppCompatButton
import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.base.BaseActivity
import com.moeezasapplication.app.databinding.ActivityHelpBinding
import com.moeezasapplication.app.modules.aboutus.ui.AboutusActivity
import com.moeezasapplication.app.modules.help.`data`.viewmodel.HelpVM
import com.moeezasapplication.app.modules.privacy.ui.PrivacyActivity
import com.moeezasapplication.app.modules.termc.ui.TermcActivity
import com.moeezasapplication.app.modules.welcome.ui.WelcomeActivity
import kotlin.String
import kotlin.Unit

class HelpActivity : BaseActivity<ActivityHelpBinding>(R.layout.activity_help) {
  private val viewModel: HelpVM by viewModels<HelpVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.helpVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
    val linearRowinfo = findViewById<LinearLayout>(R.id.linearRowinfo)
    linearRowinfo.setOnClickListener {
      val intent = Intent(this, AboutusActivity::class.java)
      startActivity(intent)
    }
    val linearRowinfoOne = findViewById<LinearLayout>(R.id.linearRowinfoOne)
    linearRowinfoOne.setOnClickListener {
      val intent = Intent(this, PrivacyActivity::class.java)
      startActivity(intent)
    }
    val linearRowminimize = findViewById<LinearLayout>(R.id.linearRowminimize)
    linearRowminimize.setOnClickListener {
      val intent = Intent(this, TermcActivity::class.java)
      startActivity(intent)
    }
  }

  companion object {
    const val TAG: String = "HELP_ACTIVITY"

  }
}
