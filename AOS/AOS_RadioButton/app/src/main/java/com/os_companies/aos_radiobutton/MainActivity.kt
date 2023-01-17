package com.os_companies.aos_radiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val rgCountries by lazy {
        findViewById<RadioGroup>(R.id.rgCountries)
    }

    private val rbEngland by lazy {
        findViewById<RadioButton>(R.id.rbEngland)
    }

    private val rbSpain by lazy {
        findViewById<RadioButton>(R.id.rbSpain)
    }

    private val rbFrance by lazy {
        findViewById<RadioButton>(R.id.rbFrance)
    }

    private val rbAmerica by lazy {
        findViewById<RadioButton>(R.id.rbAmerica)
    }

    private val tvAnswer by lazy {
        findViewById<TextView>(R.id.tvAnswer)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        rbEngland.text = "영국"
//        rbEngland.isChecked = true
//        rbEngland.isEnabled = false
//        rbAmerica.isClickable = false

//        rbAmerica.buttonDrawable = resources.getDrawable(R.drawable.radiobutton_image_custom, null)

//        rbAmerica.buttonDrawable = null
//        rbAmerica.background = resources.getDrawable(R.drawable.radiobutton_xml_custom, null)

        rgCountries.setOnCheckedChangeListener { _, checkedID ->

            val country : String = when(checkedID) {
                rbEngland.id -> rbEngland.text.toString()
                rbSpain.id -> rbSpain.text.toString()
                rbFrance.id -> rbFrance.text.toString()
                rbAmerica.id -> rbAmerica.text.toString()
                else -> rbEngland.text.toString()
            }

            tvAnswer.text = "A. $country"
        }


    }
}