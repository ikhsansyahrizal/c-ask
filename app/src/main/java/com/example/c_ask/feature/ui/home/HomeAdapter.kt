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
) : RecyclerView.Adapter<HomeAdapter.ItemViewHolder>() {

    var goToPetunjukArah: ((String) -> Unit)? = null
    var goToFasilitasUmum: ((String) -> Unit)? = null
    var goToJadwalKrl: ((String) -> Unit)? = null
    var goToPeta: ((String) -> Unit)? = null
    var goToLostAndFound: ((String) -> Unit)? = null

    class ItemViewHolder(val binding: RvHomeItemBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = RvHomeItemBinding.inflate(LayoutInflater.from(context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val imgFeature = imageFeature[position]
        Glide.with(context).load(imgFeature.imgPath).into(holder.binding.imgOption)

        holder.itemView.setOnClickListener {
            when (position) {
                0 -> goToPetunjukArah?.invoke("Parameter for Petunjuk Arah")
                1 -> goToFasilitasUmum?.invoke("Parameter for Fasilitas Umum")
                2 -> goToJadwalKrl?.invoke("Parameter for Jadwal KRL")
                3 -> goToPeta?.invoke("Parameter for Peta")
                4 -> goToLostAndFound?.invoke("Parameter for Lost and Found")
            }
        }
    }

    override fun getItemCount(): Int = imageFeature.size

}
