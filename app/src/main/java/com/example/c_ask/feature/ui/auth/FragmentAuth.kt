package com.example.c_ask.feature.ui.auth

import androidx.navigation.fragment.findNavController
import com.example.c_ask.base.BaseFragment
import com.example.c_ask.databinding.FragmentAuthBinding

class FragmentAuth : BaseFragment<FragmentAuthBinding>() {
    override fun init() {
        binding.btnLogin.setOnClickListener {
            findNavController().navigate(FragmentAuthDirections.actionFragmentAuthToFragmentHome())
        }
    }


}