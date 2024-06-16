package com.example.c_ask.feature.ui.jadwalkrl


import android.annotation.SuppressLint
import androidx.navigation.fragment.findNavController
import com.example.c_ask.base.BaseFragment
import com.example.c_ask.databinding.FragmentJadwalKrlBinding


class JadwalKrlFragment: BaseFragment<FragmentJadwalKrlBinding>() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun init() {
        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.webJadwalKrl.loadUrl("https://commuterline.id/perjalanan-krl/jadwal-kereta")
        binding.webJadwalKrl.settings.javaScriptEnabled = true
    }
}