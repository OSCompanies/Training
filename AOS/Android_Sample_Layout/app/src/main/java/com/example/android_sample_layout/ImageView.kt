package com.example.android_sample_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

/*

이미지뷰 사용하기

1. res/drawable / 사용할 이미지 추가 [image01. image02]
2. ImageView / 추가한 이미지 넣기

 */

class ImageView : AppCompatActivity() {
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view)

        imageChange()
    }

    // 이미지 바꾸기
    private fun imageChange() {
        val imageButton = findViewById<Button>(R.id.imageButton)
        val imageView = findViewById<ImageView>(R.id.imageView)

        imageButton.setOnClickListener {
            if (count >= 2) {
                count = 0
            }

            if (count == 0) {
                imageView.setImageResource(R.drawable.image01) // 사진 image01 넣기
            } else if (count == 1) {
                imageView.setImageResource(R.drawable.image02) // 사진 image02 넣기
            }
            count += 1
        }
    }
}