package com.example.android_sample_view_navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.android_sample_view_navigation.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        val view = binding.root

        binding.btSecToFir.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_secondFragment_to_firstFragment)
        } // 첫번째 프래그먼트로 이동
        binding.btSecToThi.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_secondFragment_to_thirdFragment)
        } // 세번째 프래그먼트로 이동

        return view
    }
}