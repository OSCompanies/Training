package com.example.android_sample_webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

/*

WebView를 사용하기 위해

1. AndroidManifest.xml에서 <uses-permission android:name="android.permission.INTERNET"/> 추가
2. AndroidManifest.xml / <application android:usesCleartextTraffic="true" 추가
3. activity_web_view.xml / <WebView> , android:id="@+id/WebView"

*/

class WebView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        webView()
    }

    private fun webView() {
        val WebView = findViewById<WebView>(R.id.mWebView)

        //웹뷰
        WebView.loadUrl("http://www.osdew.com/app/api/javascript_call/Sample_JS_DuplexCommunication.html") // 웹사이트 load
    }
}