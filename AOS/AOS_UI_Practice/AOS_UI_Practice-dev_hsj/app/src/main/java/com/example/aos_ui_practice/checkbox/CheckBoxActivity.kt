package com.example.aos_ui_practice.checkbox

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.aos_ui_practice.R

class CheckBoxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)
        initView()
    }

    private fun initView() {

        val btnTextShow = findViewById<Button>(R.id.btnTextShow)
        btnTextShow.setOnClickListener {
            val intent = Intent(this, CheckBox_Text_Show_Activity::class.java)
            startActivity(intent)
        }

        val btnDrawableRight = findViewById<Button>(R.id.btnDrawableRight)
        btnDrawableRight.setOnClickListener {
            val intent = Intent(this, CheckBox_DrawableRight_Activity::class.java)
            startActivity(intent)
        }
    }
}