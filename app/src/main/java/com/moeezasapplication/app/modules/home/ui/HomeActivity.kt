package com.moeezasapplication.app.modules.home.ui

import android.content.Intent
import android.net.Uri
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.viewModels
import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.base.BaseActivity
import com.moeezasapplication.app.databinding.ActivityHomeBinding
import com.moeezasapplication.app.modules.closetmain.ui.ClosetMainActivity
import com.moeezasapplication.app.modules.home.`data`.model.ImageSliderSliderpartywearModel
import com.moeezasapplication.app.modules.home.`data`.viewmodel.HomeVM
import com.moeezasapplication.app.modules.sidebar.ui.SidebarActivity
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.moeezasapplication.app/drawable/img_image20")


  private val imageSliderSliderpartywearItems: ArrayList<ImageSliderSliderpartywearModel> =
      arrayListOf(ImageSliderSliderpartywearModel(imageImageTwenty =
  imageUri.toString()),ImageSliderSliderpartywearModel(imageImageTwenty =
  imageUri.toString()))


  private val viewModel: HomeVM by viewModels<HomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sliderpartywearAdapter = SliderpartywearAdapter(imageSliderSliderpartywearItems,true)
    binding.imageSliderSliderpartywear.adapter = sliderpartywearAdapter
    binding.imageSliderSliderpartywear.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorGroupNineteen.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorGroupNineteen.updateIndicatorCounts(binding.imageSliderSliderpartywear.indicatorCount)
    binding.homeVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSliderpartywear.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSliderpartywear.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    val linearRowsummercollecti = findViewById<LinearLayout>(R.id.linearRowsummercollecti)
    linearRowsummercollecti.setOnClickListener {
      val intent = Intent(this, ClosetMainActivity::class.java)
      startActivity(intent)
    }
    val linearColumnwintercollecti = findViewById<LinearLayout>(R.id.linearColumnwintercollecti)
    linearColumnwintercollecti.setOnClickListener {
      val intent = Intent(this, ClosetMainActivity::class.java)
      startActivity(intent)
    }
    val imageImageTwentyOne = findViewById<ImageView>(R.id.imageImageTwentyOne)
    imageImageTwentyOne.setOnClickListener {
      val intent = Intent(this, ClosetMainActivity::class.java)
      startActivity(intent)
    }
    val imageMenu = findViewById<ImageView>(R.id.imageMenu)
    imageMenu.setOnClickListener {
      val intent = Intent(this, SidebarActivity::class.java)
      startActivity(intent)
    }
  }

  companion object {
    const val TAG: String = "HOME_ACTIVITY"

  }
}
