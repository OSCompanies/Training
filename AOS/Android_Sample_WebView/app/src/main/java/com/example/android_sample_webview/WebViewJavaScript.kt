package com.example.android_sample_webview

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.JavascriptInterface
import android.webkit.ValueCallback
import android.webkit.WebView
import android.widget.Button
import android.widget.Toast

/*

WebView를 사용하기 위해

1. AndroidManifest.xml에서 <uses-permission android:name="android.permission.INTERNET"/> 추가
2. AndroidManifest.xml / <application android:usesCleartextTraffic="true" 추가
3. activity_web_view.xml / <WebView> , android:id="@+id/WebView"

자바스크립트 결합
1. 결합할 인터페이스 만들기
2. 웹뷰에 결합하기
*/

class WebViewJavaScript : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view_java_script)

        webView()
    }

    private fun webView() {
        val WebView = findViewById<WebView>(R.id.jsWebView)
        val Button = findViewById<Button>(R.id.jsButton)

        // 웹뷰
        WebView.loadUrl("http://www.osdew.com/app/api/javascript_call/Sample_JS_DuplexCommunication.html") // 웹 사이트 load
        WebView.addJavascriptInterface(CustomJavaScriptCallback(this),"WebViewCallbackInterface") // 자바 스크립트 결합

        // 웹뷰 세팅
        WebView.settings.javaScriptEnabled = true // 자바스크립트 사용

        // 앱에서 웹 컨트롤
        Button.setOnClickListener {
            WebView.evaluateJavascript("javascript:changeColor();", ValueCallback {
                Log.d("DEBUG", "자바스크립트 함수 리턴 : " + it)
            })
        }
    }

}

// 결합할 인터페이스
class CustomJavaScriptCallback(private val mContext: Context) {

    @JavascriptInterface
    fun webViewToApp() {
        Toast.makeText(mContext, "테스트 테스트", Toast.LENGTH_LONG).show()
    }
}