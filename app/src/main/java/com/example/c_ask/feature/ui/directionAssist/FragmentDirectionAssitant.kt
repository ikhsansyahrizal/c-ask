package com.example.c_ask.feature.ui.directionAssist

import android.widget.ArrayAdapter
import androidx.navigation.fragment.findNavController
import com.example.c_ask.R
import com.example.c_ask.base.BaseFragment
import com.example.c_ask.databinding.FragmentDirectionAssitantBinding

class FragmentDirectionAssitant : BaseFragment<FragmentDirectionAssitantBinding>() {
    override fun init() {
        binding.btnSubmit.setOnClickListener {
            findNavController().navigate(FragmentDirectionAssitantDirections.actionFragmentDirectionAssitantToFragmentDirectionResult())
        }

        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }



}