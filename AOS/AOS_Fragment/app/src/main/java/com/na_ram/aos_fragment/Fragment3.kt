package com.na_ram.aos_fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class Fragment3: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val id = arguments?.getInt("id")

        val tvFragment = view?.findViewById<TextView>(R.id.tvFragment)
        tvFragment.text = "Fragment$id"

        val btnMoveToActivity = view?.findViewById<Button>(R.id.btnMoveToActivity)

        btnMoveToActivity.setOnClickListener {
            activity?.let {
                val intent = Intent(context, SubActivity::class.java)
                intent.putExtra("id", id)
                startActivity(intent)
            }
        }
    }

}