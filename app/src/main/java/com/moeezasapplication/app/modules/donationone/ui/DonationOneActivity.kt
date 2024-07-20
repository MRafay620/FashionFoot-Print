package com.moeezasapplication.app.modules.donationone.ui

import android.view.View
import androidx.activity.viewModels
import com.moeezasapplication.app.R
import com.moeezasapplication.app.appcomponents.base.BaseActivity
import com.moeezasapplication.app.databinding.ActivityDonationOneBinding
import com.moeezasapplication.app.modules.donationone.`data`.model.DonationOneRowModel
import com.moeezasapplication.app.modules.donationone.`data`.viewmodel.DonationOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DonationOneActivity : BaseActivity<ActivityDonationOneBinding>(R.layout.activity_donation_one)
    {
  private val viewModel: DonationOneVM by viewModels<DonationOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val donationOneAdapter =
    DonationOneAdapter(viewModel.donationOneList.value?:mutableListOf())
    binding.recyclerDonationOne.adapter = donationOneAdapter
    donationOneAdapter.setOnItemClickListener(
    object : DonationOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DonationOneRowModel) {
        onClickRecyclerDonationOne(view, position, item)
      }
    }
    )
    viewModel.donationOneList.observe(this) {
      donationOneAdapter.updateData(it)
    }
    binding.donationOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerDonationOne(
    view: View,
    position: Int,
    item: DonationOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DONATION_ONE_ACTIVITY"

  }
}
