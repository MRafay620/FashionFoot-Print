package com.moeezasapplication.app.modules.otpverification.ui

import android.content.Intent
import android.content.IntentFilter
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import com.google.android.gms.auth.api.phone.SmsRetriever
import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.base.BaseActivity
import com.moeezasapplication.app.databinding.ActivityOtpVerificationBinding
import com.moeezasapplication.app.modules.otpverification.`data`.viewmodel.OtpVerificationVM
import java.util.regex.Matcher
import java.util.regex.Pattern
import kotlin.String
import kotlin.Unit

class OtpVerificationActivity :
    BaseActivity<ActivityOtpVerificationBinding>(R.layout.activity_otp_verification) {
  private var otpViewOtpviewBroadcastReceiver: OtpViewOtpviewBroadcastReceiver? = null


  val getActivityResult: ActivityResultLauncher<Intent> =
      registerForActivityResult(ActivityResultContracts.StartActivityForResult(),
  ActivityResultCallback {
    val message = it.data?.getStringExtra(SmsRetriever.EXTRA_SMS_MESSAGE)
    getOtpFromMessage(message!!)
    })


    private val viewModel: OtpVerificationVM by viewModels<OtpVerificationVM>()

    override fun onInitialized(): Unit {
      viewModel.navArguments = intent.extras?.getBundle("bundle")
      startSmartUserConsent()
      binding.otpVerificationVM = viewModel
    }

    override fun onStop(): Unit {
      super.onStop()
      unregisterReceiver(otpViewOtpviewBroadcastReceiver)
    }

    override fun onStart(): Unit {
      super.onStart()
      registerBroadcastReceiver()
    }

    override fun setUpClicks(): Unit {
      binding.btnArrowleft.setOnClickListener {
        finish()
      }
    }

    private fun startSmartUserConsent(): Unit {
      val client = SmsRetriever.getClient(this)
      client.startSmsUserConsent(null)
    }

    private fun registerBroadcastReceiver(): Unit {
      otpViewOtpviewBroadcastReceiver = OtpViewOtpviewBroadcastReceiver()
      otpViewOtpviewBroadcastReceiver?.otpBroadcastReceiverListener =
      object : OtpViewOtpviewBroadcastReceiver.OtpBroadcastListener {
        override fun onSuccess(intent: Intent?) {
          getActivityResult.launch(intent)
        }
        override fun onFailure() {

        }
      }
      val intentFilter = IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION)
      registerReceiver(otpViewOtpviewBroadcastReceiver, intentFilter)
    }

    private fun getOtpFromMessage(message: String): Unit {
      val otpPattern: Pattern = Pattern.compile("(|^)\\d{4}")
      val matcher: Matcher = otpPattern.matcher(message)
      if (matcher.find()) {
        binding.otpViewOtpview?.setText(matcher.group(0))
      }
    }

    companion object {
      const val TAG: String = "OTP_VERIFICATION_ACTIVITY"

    }
  }
