package com.example.android_sample_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

/*

gif 사용하기

라이브러리 Glide 사용
1. build.gradle / implementation 'com.github.bumptech.glide:glide:4.12.0' 추가
2. res/drawable / gif 이미지 추가

 */

class Gif : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gif)

        val gifView = findViewById<ImageView>(R.id.gifImage)

        Glide.with(this).load(R.drawable.gif).into(gifView) // gif 사용하기
    }
}