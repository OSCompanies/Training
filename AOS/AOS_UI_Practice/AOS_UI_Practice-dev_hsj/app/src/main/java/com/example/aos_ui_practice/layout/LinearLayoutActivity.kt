package com.example.aos_ui_practice.layout

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.aos_ui_practice.R

class LinearLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout)

        initView()
    }

    private fun initView() {
        val btnVertical = findViewById<Button>(R.id.btnVertical)
        btnVertical.setOnClickListener {
            val intent = Intent(this, LinearLayout_Vertical_Activity::class.java)
            startActivity(intent)
        }

        val btnhorizontal = findViewById<Button>(R.id.btnhorizontal)
        btnhorizontal.setOnClickListener {
            val intent = Intent(this, LinearLayout_Horizontal_Activity::class.java)
            startActivity(intent)
        }

        val btnWeight = findViewById<Button>(R.id.btnWeight)
        btnWeight.setOnClickListener {
            val intent = Intent(this, LinearLayout_Weight_Activity::class.java)
            startActivity(intent)
        }

        val btnBackgroundColor = findViewById<Button>(R.id.btnBackgroundColor)
        btnBackgroundColor.setOnClickListener {
            val intent = Intent(this, LinearLayout_BackgroundColor_Activity::class.java)
            startActivity(intent)
        }
    }
}