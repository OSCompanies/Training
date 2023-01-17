package com.example.aos_ui_practice.switchView

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.aos_ui_practice.R

class SwitchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch)

        initView()
    }

    private fun initView() {
        val btnSwitchCheckStatus = findViewById<Button>(R.id.btnSwitchCheckStatus)
        btnSwitchCheckStatus.setOnClickListener {
            val intent = Intent(this, Switch_Check_Status_Activity::class.java)
            startActivity(intent)
        }
    }
}