package com.example.android_sample_listview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class ListViewAdapter(private val items: ArrayList<ListItem>) : BaseAdapter() {

    // 아이템 개수
    override fun getCount(): Int = items.size

    // 아이템 데이터
    override fun getItem(position: Int): ListItem = items[position]

    // 아이템 아이디
    override fun getItemId(position: Int): Long = position.toLong()

    // 함수 안에 사용할 부분
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view : View = LayoutInflater.from(parent?.context).inflate(R.layout.item_listview, parent, false)

        val image = view.findViewById<ImageView>(R.id.itemImageView)
        val name = view.findViewById<TextView>(R.id.itemTextView)

        val content = items[position]

        image.setImageResource(content.itemImage)
        name.text = content.itemName

        return view
    }
}