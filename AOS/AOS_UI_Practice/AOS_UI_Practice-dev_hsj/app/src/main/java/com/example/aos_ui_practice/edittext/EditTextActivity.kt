package com.example.aos_ui_practice.edittext

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.aos_ui_practice.R

class EditTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)

        initView()
    }

    private fun initView() {
        val btnHintShow = findViewById<Button>(R.id.btnHintShow)
        btnHintShow.setOnClickListener {
            val intent = Intent(this, EditText_Hint_Show_Activity::class.java)
            startActivity(intent)
        }

        val btnHintFontColor = findViewById<Button>(R.id.btnHintFontColor)
        btnHintFontColor.setOnClickListener {
            val intent = Intent(this, EditText_Hint_Font_Color_Activity::class.java)
            startActivity(intent)
        }

        val btnBackgroundTint = findViewById<Button>(R.id.btnBackgroundTint)
        btnBackgroundTint.setOnClickListener {
            val intent = Intent(this, EditText_BackgroundTint_Activity::class.java)
            startActivity(intent)
        }
    }
}