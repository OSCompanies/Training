package com.example.aos_ui_practice.radiobutton

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.aos_ui_practice.R

class RadioButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)

        initView()
    }

    private fun initView() {
        val btnRadioButton = findViewById<Button>(R.id.btnRadioButton)
        btnRadioButton.setOnClickListener {
            val intent = Intent(this, RadioButton_Use_Activity::class.java)
            startActivity(intent)
        }
    }
}