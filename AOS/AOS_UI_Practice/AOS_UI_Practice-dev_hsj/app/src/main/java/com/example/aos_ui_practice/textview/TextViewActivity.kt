package com.example.aos_ui_practice.textview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.aos_ui_practice.R

class TextViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view)

        initView()
    }

    private fun initView() {
        val btnGravity = findViewById<Button>(R.id.btnGravity)
        btnGravity.setOnClickListener {
            val intent = Intent(this, TextView_Gravity_Activity::class.java)
            startActivity(intent)
        }

        val btnShow = findViewById<Button>(R.id.btnShow)
        btnShow.setOnClickListener {
            val intent = Intent(this, TextView_Show_Activity::class.java)
            startActivity(intent)
        }

        val btnFontSize = findViewById<Button>(R.id.btnFontSize)
        btnFontSize.setOnClickListener {
            val intent = Intent(this, TextView_FontSize_Activity::class.java)
            startActivity(intent)
        }

        val btnFontColor = findViewById<Button>(R.id.btnFontColor)
        btnFontColor.setOnClickListener {
            val intent = Intent(this, TextView_Font_Color_Activity::class.java)
            startActivity(intent)
        }

        val btnMaxLine = findViewById<Button>(R.id.btnMaxLine)
        btnMaxLine.setOnClickListener {
            val intent = Intent(this, TextView_MaxLine_Activity::class.java)
            startActivity(intent)
        }
    }
}