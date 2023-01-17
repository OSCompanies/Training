package com.naram.aos_viewbinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.naram.aos_viewbinding.databinding.FragmentBindingSampleBinding

class BindingSampleFragment : Fragment() {

    private var _binding: FragmentBindingSampleBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBindingSampleBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvTest.text = "Fragment Binding"
        binding.btnTest.setOnClickListener {
            // DO SOMETHING
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}