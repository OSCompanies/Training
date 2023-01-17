package com.example.android_sample_view_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.android_sample_view_navigation.databinding.ActivityMainBinding

/*

JetPack Navigation 사용해서 화면 이동하기

1. build.gradle /
    implementation 'androidx.navigation:navigation-fragment-ktx:2.3.5'
    implementation 'androidx.navigation:navigation-ui-ktx:2.3.5' 추가하기
2. 탐색 그래프 만들기
    res에 마우스 우클릭 New -> Android Resource File 선택,
    navigation을 선택히고 이름은 nav_graph후 OK클릭
3. 프래그먼트 3개 생성하기
    샘플에서는 FirstFragment, SecondFragment, ThirdFragment가 있음
4. XML 만들기
    activity_main.xml에 <FragmentContainerView/> 생성,
    id값 navContainer 설정,
    name값 androidx.navigation.fragment.NavHostFragment 지정 [필수]
    app:navGraph에 만들어둔 nav_graph 결합하기 [필수]
5. 탐색 그래프에 대상 추가
    navigation/nav_graph.xml에서 Design 클릭후 New Destination 아이콘 클릭후
    만들어둔 프래그먼트 3개 추가
6. 탐색 그래프 경로 이어주기
    추가한 프래그먼트 3개를 원하는 경로로 마우스 좌클릭으로 서로 이어주기
7. 원하는 프래그먼트에서 사용하기
    FirstFragment에서 버튼 클릭시 SecondFragment, ThirdFragment로 이동

 */

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        BottomNavBar()
    }

    /*

    바텀 네비게이션 사용하기
    1. 메뉴 만들기
        res에 마우스 우클릭 New -> Android Resource File 선택,
        menu를 선택하고 이름은 nav_bottom후 OK클릭
    2. 메뉴 XML 만들기
        id, icon, title 만들기
        [메뉴의 id값과 nav_graph.xml의 코드 id값이 서로 동일해야함 - 필수]
    3. XML 만들기
        activity_main.xml에 <BottomNavigationView/> 생성,
        id값 navBottom 설정,
        app:menu="@menu/nav_bottom" 만들어준 menu를 결합
    4. 바텀네비게이션을 보여줄 액티비티 설정하기
        MainActivity에 바텀 네비게이션을 설정한다.

     */

    // 바텀 네비게이션 바
    private fun BottomNavBar() {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navContainer) as NavHostFragment // 프래그먼트를 지정한 뷰에서 실행되도록 함
        val navController = navHostFragment.navController // NavHost에서 앱 탐색을 관리하는 객체
        binding.navBottom.setupWithNavController(navController) // 만든 탐색 그래프대로 바텀네비게이션을 컨트롤
    }
}