package com.example.android_sample_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val backButton = findViewById<Button>(R.id.btBack)

        // 뒤로가기
        backButton.setOnClickListener {
            finish() // 액티비티 종료
        }
    }
}