package com.example.android_sample_webview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android_sample_webview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        button()
    }

    fun button() {
        binding.mButton.setOnClickListener {
            val intent = Intent(this, WebView::class.java)
            startActivity(intent)
        }
        binding.mButtonJs.setOnClickListener {
            val intent = Intent(this, WebViewJavaScript::class.java)
            startActivity(intent)
        }
    }
}