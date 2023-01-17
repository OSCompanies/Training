package com.example.aos_ui_practice.button

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.aos_ui_practice.R

class ButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)

        initView()
    }

    private fun initView() {

        val btnWidth_and_Height = findViewById<Button>(R.id.btnWidth_and_Height)
        btnWidth_and_Height.setOnClickListener {
            val intent = Intent(this, Button_Width_and_Height_Activity::class.java)
            startActivity(intent)
        }

        val btnGravity = findViewById<Button>(R.id.btnGravity)
        btnGravity.setOnClickListener {
            val intent = Intent(this, Button_Gravity_Activity::class.java)
            startActivity(intent)
        }

        val btnLayoutGravity = findViewById<Button>(R.id.btnLayoutGravity)
        btnLayoutGravity.setOnClickListener {
            val intent = Intent(this, Button_LayoutGravity_Activity::class.java)
            startActivity(intent)
        }

        val btnTextShow = findViewById<Button>(R.id.btnTextShow)
        btnTextShow.setOnClickListener {
            val intent = Intent(this, Button_Text_Show_Activity::class.java)
            startActivity(intent)
        }

        val btnFontSize = findViewById<Button>(R.id.btnFontSize)
        btnFontSize.setOnClickListener {
            val intent = Intent(this, Button_Font_Size_Activity::class.java)
            startActivity(intent)
        }

        val btnFontColor = findViewById<Button>(R.id.btnFontColor)
        btnFontColor.setOnClickListener {
            val intent = Intent(this, Button_Font_Color_Activity::class.java)
            startActivity(intent)
        }

        val btnBackgroundColor = findViewById<Button>(R.id.btnBackgroundColor)
        btnBackgroundColor.setOnClickListener {
            val intent = Intent(this, Button_Background_Color_Activity::class.java)
            startActivity(intent)
        }
    }
}