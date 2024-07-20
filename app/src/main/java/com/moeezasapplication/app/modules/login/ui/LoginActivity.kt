package com.moeezasapplication.app.modules.login.ui

import android.content.Intent
import android.widget.TextView
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
import com.moeezasapplication.app.databinding.ActivityLoginBinding
import com.moeezasapplication.app.modules.homeone.ui.HomeOneActivity
import com.moeezasapplication.app.modules.login.`data`.viewmodel.LoginVM
import com.moeezasapplication.app.modules.register.ui.RegisterActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  private lateinit var googleLogin: GoogleHelper

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()

  private val facebookLogin: FacebookHelper = FacebookHelper()

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
    binding.loginVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
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
        binding.imageGoogle.setOnClickListener {
          googleLogin.login()
        }
        binding.btnArrowleft.setOnClickListener {
          finish()
        }
      val btnLogin = findViewById<AppCompatButton>(R.id.btnLogin)
      btnLogin.setOnClickListener {
        val intent = Intent(this, HomeOneActivity::class.java)
        startActivity(intent)
      }
      val txtConfirmation = findViewById<TextView>(R.id.txtConfirmation)
      txtConfirmation.setOnClickListener {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
      }
      }

      companion object {
        const val TAG: String = "LOGIN_ACTIVITY"

      }
    }
