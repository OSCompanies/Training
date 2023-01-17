package com.example.android_sample_listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.TextView

/*

리스트뷰를 사용하기 위해
1. Model 만들기 [ListItem]
2. Item xml 만들기 [item_listview.xml]
3. Adapter 만들기 [ListViewAdapter]
4. Adapter를 Activity에 결합하기
5. 리스트 item 클릭 이벤트 만들기

 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        val textView = findViewById<TextView>(R.id.mTextView)

        val adapter = ListViewAdapter(ListData()) // 어댑터에 리스트 결합
        listView.adapter = adapter // 어댑터 실행

        // 아이템 항목 클릭 이벤트 리스너, res/values/strings.xml에 미리 만들어 놓은 문자열 불러오기
        listView.setOnItemClickListener { parent, view, position, id ->
            val item = parent.getItemAtPosition(position) as ListItem

            if (item.itemName == "대한민국") {
                textView.setText(R.string.korea)
            } else if (item.itemName == "일본") {
                textView.setText(R.string.japan)
            } else if (item.itemName == "몽골") {
                textView.setText(R.string.mongolia)
            } else if (item.itemName == "대만") {
                textView.setText(R.string.taiwan)
            } else if (item.itemName == "중국") {
                textView.setText(R.string.china)
            }
        }
    }

}

// 사용할 리스트
fun ListData(): ArrayList<ListItem> {
    val itemList = arrayListOf<ListItem>()
    return itemList.apply {
        add(ListItem(R.drawable.korea,"대한민국"))
        add(ListItem(R.drawable.japan,"일본"))
        add(ListItem(R.drawable.mongolia,"몽골"))
        add(ListItem(R.drawable.taiwan,"대만"))
        add(ListItem(R.drawable.china,"중국"))
    }
}