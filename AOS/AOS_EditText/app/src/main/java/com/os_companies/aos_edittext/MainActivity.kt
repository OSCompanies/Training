package com.os_companies.aos_edittext

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {

    private val etName : EditText by lazy {
        findViewById(R.id.etName)
    }

    private val etAge : EditText by lazy {
        findViewById(R.id.etAge)
    }

    private val etPassword : EditText by lazy {
        findViewById(R.id.etPassword)
    }

    private val tvInformation : TextView by lazy {
        findViewById(R.id.tvInformation)
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etName.setTextColor(resources.getColor(R.color.white, null))
        etName.hint = "이름을 입력하세요."
        etName.setHintTextColor(resources.getColor(R.color.white, null))
        etName.background = resources.getDrawable(R.color.purple_200, null)

//        etAge.background = resources.getDrawable(R.drawable.edittext_rounded_background, null)
//        etAge.isEnabled = false

        etName.addTextChangedListener(object: TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.d("Before Text Change", "$s")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.d("On Text Change", "$s")
                val age = etAge.text
                tvInformation.text = "$s 님의 나이는 $age 입니다."
            }

            override fun afterTextChanged(s: Editable?) {
                Log.d("After Text Change", "$s")
            }

        })

    }
}