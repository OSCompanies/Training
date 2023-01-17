package com.example.aos_ui_practice.webview

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import com.example.aos_ui_practice.R

class WebView_LoadUrl_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view_load_url)

        initView()
    }

    private fun initView() {
        val webView = findViewById<WebView>(R.id.webView)
        webView.loadUrl("https://github.com/wasabeef/awesome-android-ui#Layout")
    }
}