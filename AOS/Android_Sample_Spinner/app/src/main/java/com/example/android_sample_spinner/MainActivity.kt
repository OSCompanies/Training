package com.example.android_sample_spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.planets_spinner)
        val textVew = findViewById<TextView>(R.id.mTextView)

        // createFromResource를 사용하면 문자열 배열에서 ArrayAdapter를 생성할 수 있다. 이 메서드의 세 번째 인수는 선택된 항목이 스피너 컨트롤에 나타나는 방식을 정의하는 레이아웃 리소스
        ArrayAdapter.createFromResource(this, R.array.planets_array, android.R.layout.simple_spinner_item)
            .also { adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item) // 어댑터가 스피너 선택 항목의 목록을 표시하는데 사용해야 하는 레이아웃을 지정한다
                spinner.adapter = adapter // 어댑터를 Spinner에 적용한다.
            }

        // 스피너 아이템 선택 응답
        spinner.onItemSelectedListener = object  : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                textVew.text = "선택된 행성은\n ${spinner.getItemAtPosition(position)} 입니다."
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }
    }
}