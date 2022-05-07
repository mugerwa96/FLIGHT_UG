package com.mugerwa.flight_ug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    private lateinit var  webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            webView=findViewById(R.id.webview)
            webView.apply {
                webViewClient= WebViewClient()
                settings.javaScriptEnabled=true
                loadUrl("https://ugandairlines.com/book-flight")
            }
    }

}