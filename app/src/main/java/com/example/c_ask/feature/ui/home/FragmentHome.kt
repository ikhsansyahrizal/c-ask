package com.example.c_ask.feature.ui.home

import androidx.navigation.fragment.findNavController
import com.example.c_ask.R
import com.example.c_ask.base.BaseFragment
import com.example.c_ask.databinding.FragmentHomeBinding
import com.example.c_ask.model.ImageFeature

class FragmentHome : BaseFragment<FragmentHomeBinding>() {

    private lateinit var homeAdapter: HomeAdapter

    override fun init() {

        val listImage = getImageFeatures()
        homeAdapter = HomeAdapter(requireContext(), listImage)
        binding.rvHomePage.adapter = homeAdapter

        homeAdapter.goToPetunjukArah = {
            findNavController().navigate(FragmentHomeDirections.actionFragmentHomeToFragmentDirectionAssitant())
        }
        homeAdapter.goToFasilitasUmum = {
            findNavController().navigate(FragmentHomeDirections.actionFragmentHomeToFasilitasUmumFragment())
        }
        homeAdapter.goToJadwalKrl = {
            findNavController().navigate(FragmentHomeDirections.actionFragmentHomeToJadwalKrlFragment())
        }
        homeAdapter.goToPeta = {
            findNavController().navigate(FragmentHomeDirections.actionFragmentHomeToPetaKrlFragment())
        }
        homeAdapter.goToLostAndFound = {
            findNavController().navigate(FragmentHomeDirections.actionFragmentHomeToLostAndFoundFragment())
        }


    }


    private fun getImageFeatures(): List<ImageFeature> {
        val imageResIds = listOf(
            R.drawable.img_bantuan_petunjuk_arah,
            R.drawable.img_fasilitas_umum,
            R.drawable.img_jadwal_krl,
            R.drawable.img_peta_route,
            R.drawable.img_lost_found
        )
        return imageResIds.map { ImageFeature(it) }
    }

}