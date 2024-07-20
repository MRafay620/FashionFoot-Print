package com.moeezasapplication.app.modules.register.ui

import android.content.Intent
import androidx.activity.viewModels
import androidx.appcompat.widget.AppCompatButton
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.base.BaseActivity
import com.moeezasapplication.app.appcomponents.facebookauth.FacebookHelper
import com.moeezasapplication.app.appcomponents.googleauth.GoogleHelper
import com.moeezasapplication.app.databinding.ActivityRegisterBinding
import com.moeezasapplication.app.modules.homeone.ui.HomeOneActivity
import com.moeezasapplication.app.modules.register.`data`.viewmodel.RegisterVM
import com.moeezasapplication.app.modules.welcome.ui.WelcomeActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class RegisterActivity : BaseActivity<ActivityRegisterBinding>(R.layout.activity_register) {
  private val viewModel: RegisterVM by viewModels<RegisterVM>()

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()

  private val facebookLogin: FacebookHelper = FacebookHelper()

  private lateinit var googleLogin: GoogleHelper

  override fun onActivityResult(
    requestCode: Int,
    resultCode: Int,
    `data`: Intent?
  ) {
    callbackManager.onActivityResult(requestCode, resultCode, data)
    super.onActivityResult(requestCode,resultCode,data)
  }

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registerVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.imageGoogle.setOnClickListener {
        googleLogin.login()
      }
      binding.imageFacebook.setOnClickListener {
        LoginManager.getInstance().logInWithReadPermissions(this, listOf("public_profile"))
        facebookLogin.login(callbackManager,object : FacebookCallback<LoginResult> {
          override fun onSuccess(result: LoginResult?) {
          }
          override fun onError(error: FacebookException?) {
          }
          override fun onCancel() {
          }
          })
        }
        binding.btnArrowleft.setOnClickListener {
          finish()
        }
      val btnRegister = findViewById<AppCompatButton>(R.id.btnRegister)
      btnRegister.setOnClickListener {
        val intent = Intent(this, HomeOneActivity::class.java)
        startActivity(intent)
      }
      }

      companion object {
        const val TAG: String = "REGISTER_ACTIVITY"

      }
    }
