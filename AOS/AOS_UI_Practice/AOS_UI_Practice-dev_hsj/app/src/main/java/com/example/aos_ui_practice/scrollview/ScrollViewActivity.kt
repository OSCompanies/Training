package com.example.aos_ui_practice.scrollview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.aos_ui_practice.R

class ScrollViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_view)

        initView()
    }

    private fun initView() {
        val btnScrollView = findViewById<Button>(R.id.btnScrollView)
        btnScrollView.setOnClickListener {
            val intent = Intent(this, ScrollView_Use_Activity::class.java)
            startActivity(intent)
        }
    }
}