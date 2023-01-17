package com.os_companies.aos_togglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.ToggleButton
import androidx.core.view.setPadding

class MainActivity : AppCompatActivity() {

    private val tbPower: ToggleButton by lazy {
        findViewById(R.id.tbPower)
    }

    private val tbPowerButton: ToggleButton by lazy {
        findViewById(R.id.tbPowerButton)
    }

    private val tvInformation: TextView by lazy {
        findViewById(R.id.tvInformation)
    }

    private val tbPowerImageButton: ToggleButton by lazy {
        findViewById(R.id.tbPowerImageButton)
    }

    private val tbPowerXmlButton: ToggleButton by lazy {
        findViewById(R.id.tbPowerXmlButton)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 코틀린 코드에서 ToggleButton 속성 지정하기
        tbPower.textOn = "Power On"
        tbPower.textOff = "Power Off"
        tbPower.isEnabled = false
        tbPower.isChecked = true
        tbPower.isClickable = false

        // ToggleButton의 상태 가져오기
        tbPowerButton.setOnClickListener {
            if(tbPowerButton.isChecked) {
                tvInformation.text = "전원이 켜져있습니다."
            } else {
                tvInformation.text = "전원이 꺼져있습니다."
            }
        }

        // 코틀린 코드로 ToggleButton 커스텀하기(Image)
        tbPowerImageButton.background = resources.getDrawable(R.drawable.toggle_image_custom, null)

        // 코틀린 코드로 ToggleButton 커스텀하기(Xml)
        tbPowerXmlButton.background = resources.getDrawable(R.drawable.toggle_xml_custom, null)

    }
}