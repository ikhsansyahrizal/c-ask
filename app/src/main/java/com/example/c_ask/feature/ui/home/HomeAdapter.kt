package com.example.c_ask.feature.ui.home

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.c_ask.databinding.RvHomeItemBinding
import com.example.c_ask.model.ImageFeature

class HomeAdapter(
    private val context: Context,
    private val imageFeature: List<ImageFeature>,
    private val onItemClickListener: OnItemClickListener
) : RecyclerView.Adapter<HomeAdapter.ItemViewHolder>() {

    interface OnItemClickListener {
        fun onItemClicked(imageFeature: ImageFeature)
    }

    class ItemViewHolder(val binding: RvHomeItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = RvHomeItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val imgFeature = imageFeature[position]
        Glide.with(context).load(imgFeature.imgPath).into(holder.binding.imgOption)

        holder.itemView.setOnClickListener {
            onItemClickListener.onItemClicked(imgFeature)
        }
    }

    override fun getItemCount(): Int = imageFeature.size

}
