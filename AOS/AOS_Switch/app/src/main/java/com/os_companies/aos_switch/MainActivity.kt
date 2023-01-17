package com.os_companies.aos_switch

import android.content.res.ColorStateList
import android.content.res.Resources
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val swSwitch: Switch by lazy {
        findViewById(R.id.swSwitch)
    }

    private val tvSwitchOnOff: TextView by lazy {
        findViewById(R.id.tvSwitchOnOff)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Kotlin 코드에서 속성 추가하기
//        swSwitch.text = "전원"
//        swSwitch.textOn = "On"
//        swSwitch.textOff = "Off"
//        swSwitch.showText = true
//        swSwitch.isEnabled = false
//        swSwitch.isChecked = true
//        swSwitch.isClickable = false
//        swSwitch.thumbTextPadding = 20.dp
//        swSwitch.switchMinWidth = 60.dp

//        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            swSwitch.thumbTintList = ColorStateList.valueOf(Color.parseColor("#6200EE"))
//            swSwitch.trackTintList = ColorStateList.valueOf(resources.getColor(R.color.purple_200, null))
//        }

        // Kotlin 코드에서 thumb, track image로 커스텀하기
//        swSwitch.thumbDrawable = resources.getDrawable(R.drawable.switch_image_thumb_custom, null)
//        swSwitch.trackDrawable = resources.getDrawable(R.drawable.switch_image_track_custom, null)

        // Kotlin 코드에서 thumb, track xml로 커스텀하기
//        swSwitch.thumbDrawable = resources.getDrawable(R.drawable.switch_xml_thumb_custom, null)
//        swSwitch.trackDrawable = resources.getDrawable(R.drawable.switch_xml_track_custom, null)

        swSwitch.setOnClickListener {
            if (swSwitch.isChecked) {
                tvSwitchOnOff.text = "전원 On"
            } else {
                tvSwitchOnOff.text = "전원 Off"
            }
        }

    }

    val Int.dp: Int
        get() = (this * Resources.getSystem().displayMetrics.density + 0.5F).toInt()
}