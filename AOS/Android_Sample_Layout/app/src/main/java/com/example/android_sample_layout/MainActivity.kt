package com.example.android_sample_layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.example.android_sample_layout.databinding.ActivityMainBinding

/*

뷰바인딩 사용하기

1. build.gradle /
    buildFeatures {
        viewBinding true
    }   추가

 */

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding // 뷰바인딩
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // 뷰바인딩
        setContentView(binding.root) // 뷰바인딩

        // 레이아웃 기본
        binding.btLayoutBasic.setOnClickListener {
            val intent = Intent(this, LayoutBasic::class.java)
            startActivity(intent) // 액티비티 화면이동, intent 사용
        }

        // 텍스트뷰 색상변경
        binding.btColorChange.setOnClickListener {
            val intent = Intent(this, TextView::class.java)
            startActivity(intent)
        }

        // 이미지 바꾸기
        binding.btImageView.setOnClickListener {
            val intent = Intent(this, ImageView::class.java)
            startActivity(intent)
        }

        // 전달할 데이터 입력하기
        binding.btEditText.setOnClickListener {
            val intent = Intent(this, EditText::class.java)
            val textdata = binding.etEnter.text.toString() // 전달할 데이터 [EditText에 입력한 텍스트]
            intent.putExtra("data",textdata) // intent로 데이터 전달, "data"에 담아서 전달
            startActivity(intent)
        }

        // EditText 입력 변화 이벤트 처리
        binding.etEnter.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // 텍스트를 입력하기 전에
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // 텍스트 입력란에 변화가 있을 때
            }

            override fun afterTextChanged(s: Editable?) {
                if (binding.etEnter.length() > 0) {
                    binding.btEditText.isEnabled = true // 버튼 활성화 [데이터 전달하기 버튼]
                } else {
                    binding.btColorChange.isEnabled = false // 버튼 비활성화 [데이터 전달하기 버튼]
                } // 텍스트 입력이 끝났을 때
            }

        })

        // Gif 사용하기
        binding.btGif.setOnClickListener {
            val intent = Intent(this, Gif::class.java)
            startActivity(intent)
        }
    }
}