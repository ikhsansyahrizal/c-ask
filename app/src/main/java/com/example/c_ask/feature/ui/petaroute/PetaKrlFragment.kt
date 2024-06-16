package com.example.c_ask.feature.ui.petaroute

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.c_ask.R
import com.example.c_ask.base.BaseFragment
import com.example.c_ask.databinding.FragmentPetaKrlBinding


class PetaKrlFragment : BaseFragment<FragmentPetaKrlBinding>() {
    override fun init() {
        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }

    }

}