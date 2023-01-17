package com.os_companies.aos_checkbox

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.CheckBox
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val cbCleaning: CheckBox by lazy {
        findViewById(R.id.cbCleaning)
    }

    private val cbHomework: CheckBox by lazy {
        findViewById(R.id.cbHomework)
    }

    private val cbPlans: CheckBox by lazy {
        findViewById(R.id.cbPlans)
    }

    private val cbDrawing: CheckBox by lazy {
        findViewById(R.id.cbDrawing)
    }

    private val cbHealth: CheckBox by lazy {
        findViewById(R.id.cbHealth)
    }

    private val cbSleep: CheckBox by lazy {
        findViewById(R.id.cbSleep)
    }

    private val tvDone: TextView by lazy {
        findViewById(R.id.tvDone)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cbCleaning.isEnabled = true
        cbHomework.isChecked = false
        cbDrawing.isClickable = true

        cbHealth.text = "19:00 - 운동하기"

        cbSleep.buttonDrawable = resources.getDrawable(R.drawable.checkbox_image_custom, null)

        cbPlans.setOnClickListener {
            val plans = "Done : ${cbPlans.text}"
            if(cbPlans.isChecked) {
                // 선택되었음
                tvDone.text = plans
            } else {
                // 선택 해제
                if(tvDone.text.contains(plans))
                    tvDone.text = ""
            }
        }

        cbCleaning.setOnClickListener {
            val cleans = "Done : ${cbCleaning.text}"
            if(cbCleaning.isChecked) {
                // 선택되었음
                tvDone.text = cleans
            } else {
                // 선택 해제
                if(tvDone.text.contains(cleans))
                    tvDone.text = ""
            }
        }

        cbHomework.setOnClickListener {
            val homeworks = "Done : ${cbHomework.text}"
            if(cbHomework.isChecked) {
                // 선택되었음
                tvDone.text = homeworks
            } else {
                // 선택 해제
                if(tvDone.text.contains(homeworks))
                    tvDone.text = ""
            }
        }

        cbDrawing.setOnClickListener {
            val draws = "Done : ${cbDrawing.text}"
            if(cbDrawing.isChecked) {
                // 선택되었음
                tvDone.text = draws
            } else {
                // 선택 해제
                if(tvDone.text.contains(draws))
                    tvDone.text = ""
            }
        }

    }

    val Int.dp : Int
        get() = (this * Resources.getSystem().displayMetrics.density + 0.5F)
            .toInt()

}