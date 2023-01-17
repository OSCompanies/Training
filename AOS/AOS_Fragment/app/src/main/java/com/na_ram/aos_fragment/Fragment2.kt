package com.na_ram.aos_fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import androidx.fragment.app.Fragment

class Fragment2: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var id = arguments?.getInt("id")

        val tvFragment = view.findViewById<TextView>(R.id.tvFragment)
        tvFragment.text = "Fragment$id"

        id?.let {
            id++
        }

        val tvnMoveToNextFragment = view.findViewById<Button>(R.id.btnMoveToNextFragment)
        tvnMoveToNextFragment.setOnClickListener {
            val bundle = Bundle()
            id?.let {
                bundle.putInt("id", it)
            }

            val fragment3 = Fragment3()
            fragment3.arguments = bundle
            childFragmentManager.beginTransaction()
                .replace(R.id.flNextFragment, fragment3)
                .commit()
//            parentFragmentManager.beginTransaction()
//                .replace(R.id.flNextFragment, fragment3)
//                .commit()

            val flNextFragment = view?.findViewById<FrameLayout>(R.id.flNextFragment)
            flNextFragment.visibility = View.VISIBLE
        }

    }

}