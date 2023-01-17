package com.os_companies.aos_tablayout

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabItem
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.os_companies.aos_tablayout.adapter.ViewPager2Adapter

class MainActivity : AppCompatActivity() {

    private val tlTabLayout: TabLayout by lazy {
        findViewById(R.id.tlTabLayout)
    }

//    private val flFragmentContainer: FrameLayout by lazy {
//        findViewById(R.id.flFragmentContainer)
//    }

    private val vpViewPager2: ViewPager2 by lazy {
        findViewById(R.id.vpViewPager2)
    }

    private val tiTab1: TabItem by lazy {
        findViewById(R.id.tiTab1)
    }

    private val Fragment1 = Fragment1()
    private val Fragment2 = Fragment2()
    private val Fragment3 = Fragment3()

    private val fragments : List<Fragment> = listOf(
        Fragment1,
        Fragment2,
        Fragment3
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      // changeFragmentInFrameLayout(Fragment1)

        // 코틀린 코드에서 TabLayout 속성 지정하기
//        tlTabLayout.setTabTextColors(R.color.black, Color.parseColor("#FFBBBB"))
//        if(Build.VERSION.SDK_INT > Build.VERSION_CODES.M)
//            tlTabLayout.tabTextColors = ColorStateList.valueOf(resources.getColor(R.color.black, null))
//
//        tlTabLayout.setSelectedTabIndicator(resources.getDrawable(R.drawable.ic_tab_indicator_24, null))
//        tlTabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FFBBBB"))
//        tlTabLayout.isTabIndicatorFullWidth = false

        // 코틀린 코드에서 탭 아이템 추가
        tlTabLayout.addTab(tlTabLayout.newTab().setText("PURPLE"))

        // TabLayout 기본적인 사용법
//        tlTabLayout.addOnTabSelectedListener(
//            object : TabLayout.OnTabSelectedListener {
//                override fun onTabSelected(tab: TabLayout.Tab?) {
//
//                    when (tab!!.position) {
//                        0 -> changeFragmentInFrameLayout(Fragment1)
//                        1 -> changeFragmentInFrameLayout(Fragment2)
//                        2 -> changeFragmentInFrameLayout(Fragment3)
//                    }
//
//                }
//
//                override fun onTabUnselected(tab: TabLayout.Tab?) {
//                }
//
//                override fun onTabReselected(tab: TabLayout.Tab?) {
//                }
//
//            })

        // ViewPager2를 이용한 TabLayout 사용법
        val adapter = ViewPager2Adapter(this, fragments)
        vpViewPager2.adapter = adapter

        vpViewPager2.run {
            this.adapter = adapter
            registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    if(tlTabLayout.selectedTabPosition != position) {
                        tlTabLayout.selectTab(tlTabLayout.getTabAt(position))
                    }
                }
            })

        }

        tlTabLayout.run {
            addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener {
                override fun onTabSelected(tab: TabLayout.Tab?) {
                    val page = tab!!.position

                    if(page != vpViewPager2.currentItem) {
                        vpViewPager2.currentItem = page
                    }

                    true
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {
                }

                override fun onTabReselected(tab: TabLayout.Tab?) {
                }

            })
        }

    }

    // TabLayout 기본적인 사용법
    // 선택된 탭에 따라 FrameLayout에 보이는 Fragment를 바꾸는 함수
//    private fun changeFragmentInFrameLayout(fragment: Fragment) {
//        supportFragmentManager
//            .beginTransaction()
//            .replace(R.id.flFragmentContainer, fragment)
//            .commit()
//    }

}