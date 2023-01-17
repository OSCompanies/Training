package com.na_ram.aos_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    private var id = 1

    private val btnShowFragment: Button by lazy {
        findViewById(R.id.btnShowFragment)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1: Fragment = Fragment1()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.flFragmentContainer, fragment1)
            .commit()


        btnShowFragment.setOnClickListener {

            id++

            val bundle = Bundle()
            bundle.putInt("id", id)

            val fragment2: Fragment = Fragment2()
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flFragmentContainer, fragment2.apply {
                    arguments = bundle
                })
                .commit()
        }

    }

    fun getID(): Int {
        return id
    }
}