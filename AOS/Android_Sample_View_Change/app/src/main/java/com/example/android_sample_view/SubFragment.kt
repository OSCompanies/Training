package com.example.android_sample_view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android_sample_view.databinding.FragmentSubBinding

class SubFragment : Fragment() {
    private lateinit var binding: FragmentSubBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSubBinding.inflate(layoutInflater)
        val view = binding.root

        val mActivity = activity as MainActivity

        binding.btMoveFra.setOnClickListener {
            mActivity.changeFragment(2) // MainActivity에서 만든 함수 사용
        }

        return view
    }
}