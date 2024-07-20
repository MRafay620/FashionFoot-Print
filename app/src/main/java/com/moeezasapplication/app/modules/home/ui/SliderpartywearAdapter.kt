package com.moeezasapplication.app.modules.home.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.moeezasapplication.app.databinding.SlideritemHome1Binding
import com.moeezasapplication.app.modules.home.`data`.model.ImageSliderSliderpartywearModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderpartywearAdapter(
  val dataList: ArrayList<ImageSliderSliderpartywearModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderpartywearModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemHome1Binding) {
      binding.imageSliderSliderpartywearModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemHome1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
