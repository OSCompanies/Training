package com.example.aos_ui_practice.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.aos_ui_practice.R

class RecyclerView_Use_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_use)

        initView()
    }

    private fun initView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val items = ArrayList<RecyclerViewItem>()

        items.add(RecyclerViewItem("image1", "Test1"))
        items.add(RecyclerViewItem("image2", "Test2"))
        items.add(RecyclerViewItem("image3", "Test3"))
        items.add(RecyclerViewItem("image4", "Test4"))
        items.add(RecyclerViewItem("image5", "Test5"))
        items.add(RecyclerViewItem("image6", "Test6"))
        items.add(RecyclerViewItem("image7", "Test7"))
        items.add(RecyclerViewItem("image8", "Test8"))
        items.add(RecyclerViewItem("image9", "Test9"))
        items.add(RecyclerViewItem("image10", "Test10"))

        val adapter = RecyclerViewAdapter(items)
        recyclerView.adapter = adapter
    }
}