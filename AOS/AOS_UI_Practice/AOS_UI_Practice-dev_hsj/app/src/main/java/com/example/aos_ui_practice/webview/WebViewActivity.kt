package com.example.aos_ui_practice.webview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.aos_ui_practice.R

class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        initView()
    }

    private fun initView() {

        val btnLoadUrl = findViewById<Button>(R.id.btnLoadUrl)
        btnLoadUrl.setOnClickListener {
            val intent = Intent(this, WebView_LoadUrl_Activity::class.java)
            startActivity(intent)
        }
    }
}