package com.example.android_sample_view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android_sample_view.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        activity()
        fragment()

    }

    // Activity 에서 Activity로 이동, Intent 사용
    private fun activity() {
        binding.mButtonAct.setOnClickListener {
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        }
    }

    // Activity 에서 Fragment로 이동, FragmentManager 사용
    private fun fragment() {
        binding.mButtonFrg.setOnClickListener {
            val fragment = SubFragment()
            supportFragmentManager.beginTransaction().add(R.id.mFrameLayout, fragment).commit()
        }
    }

    // Fragment보다 상위인 Activity에 Fragment를 제어할 함수 정의
    fun changeFragment(index: Int) {
        val fragment1 = SubFragment()
        val fragment2 = NavFragment()

        when(index) {
            1 -> {
                supportFragmentManager.beginTransaction().replace(R.id.mFrameLayout, fragment1).commit()
            }
            2 -> {
                supportFragmentManager.beginTransaction().replace(R.id.mFrameLayout, fragment2).commit()
            }
        }
    }

}