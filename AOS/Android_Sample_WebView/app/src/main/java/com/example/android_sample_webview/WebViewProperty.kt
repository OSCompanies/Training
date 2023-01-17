package com.example.android_sample_webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebViewClient
import com.example.android_sample_webview.databinding.ActivityWebViewPropertyBinding

class WebViewProperty : AppCompatActivity() {
    private lateinit var binding: ActivityWebViewPropertyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebViewPropertyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        webView()
        webViewSetting()
    }

    // 웹뷰
    fun webView() {
        binding.mWebViewP.apply {
            loadUrl("http://www.osdew.com/app/api/javascript_call/Sample_JS_DuplexCommunication.html") // 웹 사이트 load

            webViewClient = WebViewClient() // 예시, 오류, 렌더링에 영향을 미치는 이벤트 처리
            webChromeClient = WebChromeClient() // 알림 등 웹 브라우저 이벤트 처리
        }

    }

    // 웹뷰 세팅
    fun webViewSetting() {
        binding.mWebViewP.settings.apply {
            javaScriptEnabled = true // 자바 스크립트 사용여부
            javaScriptCanOpenWindowsAutomatically = true // 자바 스크립트가 window.open()을 사용여부
            builtInZoomControls = false // 줌 아이콘 사용여부
            displayZoomControls = false // 줌 컨트롤 사용여부
            loadWithOverviewMode = true // 화면에 맞게 WebView 사이즈 정의
            useWideViewPort = true // ViewPort meta tag 활성화 여부
            defaultTextEncodingName = "UTF-8" // TextEncoding 이름 정의

            databaseEnabled = true // 로컬 저장소 사용여부
            domStorageEnabled = true // 로컬 저장소 사용여부

            cacheMode = WebSettings.LOAD_NO_CACHE // 캐쉬 사용 방법 정의
        }
    }
}