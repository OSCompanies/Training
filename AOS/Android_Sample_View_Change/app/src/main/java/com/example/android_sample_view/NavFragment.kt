package com.example.android_sample_view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android_sample_view.databinding.FragmentNavBinding

class NavFragment : Fragment() {
    private lateinit var binding: FragmentNavBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentNavBinding.inflate(layoutInflater)
        val view = binding.root

        val mActivity = activity as MainActivity

        binding.btMoveNav.setOnClickListener {
            mActivity.changeFragment(1) // MainActivity에서 만든 함수 사용
        }

        return view

    }
}