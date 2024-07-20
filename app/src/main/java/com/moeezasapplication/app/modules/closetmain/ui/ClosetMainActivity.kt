package com.moeezasapplication.app.modules.closetmain.ui

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.provider.MediaStore
import android.widget.ImageButton
import androidx.activity.viewModels
import androidx.appcompat.widget.AppCompatButton
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.base.BaseActivity
import com.moeezasapplication.app.databinding.ActivityClosetMainBinding
import com.moeezasapplication.app.modules.closet.ui.ClosetActivity
import com.moeezasapplication.app.modules.closetmain.`data`.viewmodel.ClosetMainVM
import com.moeezasapplication.app.modules.welcome.ui.WelcomeActivity
import kotlin.String
import kotlin.Unit

class ClosetMainActivity : BaseActivity<ActivityClosetMainBinding>(R.layout.activity_closet_main) {
  private val CAMERA_PERMISSION_CODE = 100
  private val CAMERA_REQUEST_CODE = 101

  private val viewModel: ClosetMainVM by viewModels<ClosetMainVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.closetMainVM = viewModel
  }

  override fun setUpClicks(): Unit {
    val btnMinimize = findViewById<ImageButton>(R.id.btnMinimize)
    btnMinimize.setOnClickListener {
      if (checkCameraPermission()) {
        openCamera()
      } else {
        requestCameraPermission()
      }
    }
    val btnShirts = findViewById<AppCompatButton>(R.id.btnShirts)
    btnShirts.setOnClickListener {
      val intent = Intent(this, ClosetActivity::class.java)
      startActivity(intent)
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
    const val TAG: String = "CLOSET_MAIN_ACTIVITY"

  }
}
