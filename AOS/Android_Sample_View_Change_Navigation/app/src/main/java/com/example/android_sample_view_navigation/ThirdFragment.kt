package com.example.android_sample_view_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.android_sample_view_navigation.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
    private lateinit var binding: FragmentThirdBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentThirdBinding.inflate(layoutInflater)
        val view = binding.root

        binding.btThiToFir.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_thirdFragment_to_firstFragment)
        } // 첫번째 프래그먼트로 이동
        binding.btThiToSec.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_thirdFragment_to_secondFragment)
        } // 두번째 프래그먼트로 이동

        return view
    }
}