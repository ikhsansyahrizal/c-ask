package com.example.c_ask.feature.ui.home

import androidx.navigation.fragment.findNavController
import com.example.c_ask.R
import com.example.c_ask.base.BaseFragment
import com.example.c_ask.databinding.FragmentHomeBinding
import com.example.c_ask.model.ImageFeature

class FragmentHome : BaseFragment<FragmentHomeBinding>(), HomeAdapter.OnItemClickListener {

    private lateinit var homeAdapter: HomeAdapter

    override fun init() {

        val listImage = getImageFeatures()
        homeAdapter = HomeAdapter(requireContext(), listImage, this)
        binding.rvHomePage.adapter = homeAdapter

    }


    private fun getImageFeatures(): List<ImageFeature> {
        val imageResIds = listOf(
            R.drawable.img_petunjuk_arah,
            R.drawable.img_fasilitas_umum,
            R.drawable.img_petunjuk_arah
        )
        return imageResIds.map { ImageFeature(it) }
    }

    override fun onItemClicked(imageFeature: ImageFeature) {
        // Handle the navigation based on the clicked item
        findNavController().navigate(FragmentHomeDirections.actionFragmentHomeToFragmentDirectionAssitant())
    }
}