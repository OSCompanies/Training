package com.example.android_sample_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class EditText : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)

        editText()
    }

    // 데이터 전달하기
    private fun editText() {
        val etEditText = findViewById<EditText>(R.id.etEditText)
        val etButton = findViewById<Button>(R.id.etButton)
        val etTextView = findViewById<TextView>(R.id.etTextView)
        val etTextView2 = findViewById<TextView>(R.id.etTextView2)

        val data = intent.getStringExtra("data") // 전달받은 데이터, MainActivity에서 보낸 "data"에 담긴 데이터를 전달받는다
        etTextView.text = "전달받은 데이터 : ${data}" // 전달받은 데이터 출력

        etButton.setOnClickListener {
            val text = etEditText.text.toString() // 입력한 데이터
            etTextView2.text = "입력한 데이터 : ${text}" // 입력한 데이터 출력
        }
    }
}