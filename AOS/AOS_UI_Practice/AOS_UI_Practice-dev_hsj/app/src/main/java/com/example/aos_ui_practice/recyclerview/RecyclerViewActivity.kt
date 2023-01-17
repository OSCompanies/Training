package com.example.aos_ui_practice.recyclerview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.aos_ui_practice.R

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        initView()
    }

    private fun initView() {
        val btnRecyclerView = findViewById<Button>(R.id.btnRecyclerView)
        btnRecyclerView.setOnClickListener {
            val intent = Intent(this, RecyclerView_Use_Activity::class.java)
            startActivity(intent)
        }
    }
}