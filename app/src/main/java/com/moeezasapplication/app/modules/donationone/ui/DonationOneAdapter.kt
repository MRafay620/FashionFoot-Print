package com.moeezasapplication.app.modules.donationone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.moeezasapplication.app.R
import com.moeezasapplication.app.databinding.RowDonationOneBinding
import com.moeezasapplication.app.modules.donationone.`data`.model.DonationOneRowModel
import kotlin.Int
import kotlin.collections.List

class DonationOneAdapter(
  var list: List<DonationOneRowModel>
) : RecyclerView.Adapter<DonationOneAdapter.RowDonationOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDonationOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_donation_one,parent,false)
    return RowDonationOneVH(view)
  }

  override fun onBindViewHolder(holder: RowDonationOneVH, position: Int) {
    val donationOneRowModel = DonationOneRowModel()
    // TODO uncomment following line after integration with data source
    // val donationOneRowModel = list[position]
    holder.binding.donationOneRowModel = donationOneRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<DonationOneRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: DonationOneRowModel
    ) {
    }
  }

  inner class RowDonationOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowDonationOneBinding = RowDonationOneBinding.bind(itemView)
  }
}
