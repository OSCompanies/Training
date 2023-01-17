package com.example.android_sample_view_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.android_sample_view_navigation.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        val view = binding.root

        binding.btFirToSec.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment)
        } // 두번째 프래그먼트로 이동
        binding.btFirToThi.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_thirdFragment)
        } // 세번째 프래그먼트로 이동

        return view
    }
}