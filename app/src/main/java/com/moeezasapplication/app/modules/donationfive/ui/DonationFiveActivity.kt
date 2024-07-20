package com.moeezasapplication.app.modules.donationfive.ui

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.viewModels
import androidx.appcompat.widget.AppCompatButton
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.base.BaseActivity
import com.moeezasapplication.app.databinding.ActivityDonationFiveBinding
import com.moeezasapplication.app.modules.donationfive.`data`.model.SpinnerTextFieldOneModel
import com.moeezasapplication.app.modules.donationfive.`data`.viewmodel.DonationFiveVM
import com.moeezasapplication.app.modules.donationfour.ui.DonationFourActivity
import com.moeezasapplication.app.modules.donationsix.ui.DonationSixActivity
import com.moeezasapplication.app.modules.donationthree.ui.DonationThreeActivity
import com.moeezasapplication.app.modules.donationtwo.ui.DonationTwoActivity
import com.moeezasapplication.app.modules.welcome.ui.WelcomeActivity
import kotlin.String
import kotlin.Unit

class DonationFiveActivity :
    BaseActivity<ActivityDonationFiveBinding>(R.layout.activity_donation_five) {
  private val CAMERA_PERMISSION_CODE = 100
  private val CAMERA_REQUEST_CODE = 101
  private val viewModel: DonationFiveVM by viewModels<DonationFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerTextFieldOneList.value = mutableListOf(
    SpinnerTextFieldOneModel("Item1"),
    SpinnerTextFieldOneModel("Item2"),
    SpinnerTextFieldOneModel("Item3"),
    SpinnerTextFieldOneModel("Item4"),
    SpinnerTextFieldOneModel("Item5")
    )
    val spinnerTextFieldOneAdapter =
    SpinnerTextFieldOneAdapter(this,R.layout.spinner_item,viewModel.spinnerTextFieldOneList.value?:
    mutableListOf())
    binding.spinnerTextFieldOne.adapter = spinnerTextFieldOneAdapter
    binding.donationFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    val btnPlus = findViewById<ImageButton>(R.id.btnPlus)
    btnPlus.setOnClickListener {
      if (checkCameraPermission()) {
        openCamera()
      } else {
        requestCameraPermission()
      }
    }
    val btnMakeADonationOne = findViewById<AppCompatButton>(R.id.btnMakeADonationOne)
    btnMakeADonationOne.setOnClickListener {
      Handler(Looper.getMainLooper()).postDelayed({
        val intentThree = Intent(this, DonationThreeActivity::class.java)
        startActivity(intentThree)
        Handler(Looper.getMainLooper()).postDelayed({
          val intentSix = Intent(this, DonationSixActivity::class.java)
          Handler(Looper.getMainLooper()).postDelayed({
            startActivity(intentSix)
          }, 3000) // 3000 milliseconds = 3 seconds
        }, 0) // 0 milliseconds = immediate
      }, 5000) // 5000 milliseconds = 5 seconds

    }


  }
  private fun checkCameraPermission(): Boolean {
    val result = ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
    return result == PackageManager.PERMISSION_GRANTED
  }

  private fun requestCameraPermission() {
    ActivityCompat.requestPermissions(
      this,
      arrayOf(Manifest.permission.CAMERA),
      CAMERA_PERMISSION_CODE
    )
  }

  override fun onRequestPermissionsResult(
    requestCode: Int,
    permissions: Array<out String>,
    grantResults: IntArray
  ) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    if (requestCode == CAMERA_PERMISSION_CODE) {
      if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
        openCamera()
      } else {
        // Camera permission denied
      }
    }
  }
  override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
    super.onActivityResult(requestCode, resultCode, data)
    if (requestCode == CAMERA_REQUEST_CODE && resultCode == RESULT_OK) {
      // Handle the captured image here
      val imageBitmap = data?.extras?.get("data") as? Bitmap
      // Do something with the captured image
    }
  }
  private fun openCamera() {
    val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
    startActivityForResult(intent, CAMERA_REQUEST_CODE)
  }
  companion object {
    const val TAG: String = "DONATION_FIVE_ACTIVITY"

  }
}



