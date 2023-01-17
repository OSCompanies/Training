package com.example.android_sample_layout

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class TextView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view)

        colorChange()
    }

    // 텍스트 색상 변경하기
    private fun colorChange() {
        val tvTextView = findViewById<TextView>(R.id.tvTextView)
        val btRed = findViewById<Button>(R.id.btRed)
        val btBlue = findViewById<Button>(R.id.btBlue)
        val btGreen = findViewById<Button>(R.id.btGreen)

        // 버튼 클릭 이벤트 처리
        btRed.setOnClickListener {
            tvTextView.setBackgroundResource(R.color.red) // 배경색 바꾸기
            tvTextView.setTextColor(Color.YELLOW) // 글자색 바꾸기
        }
        btBlue.setOnClickListener {
            tvTextView.setBackgroundResource(R.color.blue)
            tvTextView.setTextColor(Color.YELLOW)
        }
        btGreen.setOnClickListener {
            tvTextView.setBackgroundResource(R.color.green)
            tvTextView.setTextColor(Color.YELLOW)
        }
    }
}