package com.example.c_ask.feature.ui.home

import com.example.c_ask.R
import com.example.c_ask.base.BaseFragment
import com.example.c_ask.databinding.FragmentHomeBinding
import com.example.c_ask.model.ImageFeature

class FragmentHome : BaseFragment<FragmentHomeBinding>() {

    private lateinit var homeAdapter: HomeAdapter

    override fun init() {

        val imageFeatures = getImageFeatures()
        homeAdapter = HomeAdapter(requireContext(), imageFeatures)
        binding.rvHomePage.adapter = homeAdapter
    }


    private fun getImageFeatures(): List<ImageFeature> {
        return resources.getStringArray(R.array.image_feature)
            .map { imageName ->
                val resId = resources.getIdentifier(imageName, "drawable", requireContext().packageName)
                ImageFeature(resId)
            }
    }

}