package com.moeezasapplication.app.modules.welcome.ui

import android.content.Intent
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.widget.AppCompatButton
import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.base.BaseActivity
import com.moeezasapplication.app.databinding.ActivityWelcomeBinding
import com.moeezasapplication.app.modules.homeone.ui.HomeOneActivity
import com.moeezasapplication.app.modules.login.ui.LoginActivity
import com.moeezasapplication.app.modules.register.ui.RegisterActivity
import com.moeezasapplication.app.modules.welcome.`data`.viewmodel.WelcomeVM
import kotlin.String
import kotlin.Unit

class WelcomeActivity : BaseActivity<ActivityWelcomeBinding>(R.layout.activity_welcome) {
  private val viewModel: WelcomeVM by viewModels<WelcomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.welcomeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    val btnLogin = findViewById<AppCompatButton>(R.id.btnLogin)
    btnLogin.setOnClickListener {
      val intent = Intent(this, LoginActivity::class.java)
      startActivity(intent)
    }
    val btnRegister = findViewById<AppCompatButton>(R.id.btnRegister)
    btnRegister.setOnClickListener {
      val intent = Intent(this, RegisterActivity::class.java)
      startActivity(intent)
    }
    val txtContinueasag = findViewById<TextView>(R.id.txtContinueasag)
    txtContinueasag.setOnClickListener {
      val intent = Intent(this, HomeOneActivity::class.java)
      startActivity(intent)
    }

  }

  companion object {
    const val TAG: String = "WELCOME_ACTIVITY"

  }
}
