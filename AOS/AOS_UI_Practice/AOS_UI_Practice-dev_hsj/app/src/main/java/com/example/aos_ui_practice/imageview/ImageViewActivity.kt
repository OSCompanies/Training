package com.example.aos_ui_practice.imageview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.aos_ui_practice.R

class ImageViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view)

        initView()
    }

    private fun initView() {
        val btnImageShow = findViewById<Button>(R.id.btnImageShow)
        btnImageShow.setOnClickListener {
            val intent = Intent(this, ImageView_Image_Show_Activity::class.java)
            startActivity(intent)
        }

        val btnLayoutGravity = findViewById<Button>(R.id.btnLayoutGravity)
        btnLayoutGravity.setOnClickListener {
            val intent = Intent(this, ImageView_LayoutGravity_Activity::class.java)
            startActivity(intent)
        }
    }
}