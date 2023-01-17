package com.naram.aos_viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.naram.aos_viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvTest.text = "Activity Binding"
        binding.btnTest.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flTest, BindingSampleFragment())
                .commit()
        }
    }
}