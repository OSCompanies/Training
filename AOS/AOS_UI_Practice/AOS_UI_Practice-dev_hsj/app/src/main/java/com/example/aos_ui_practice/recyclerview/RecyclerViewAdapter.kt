package com.example.aos_ui_practice.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.aos_ui_practice.R

class RecyclerViewAdapter(private val items: ArrayList<RecyclerViewItem>) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflaeView = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_recycler_view_item, parent, false)
        return ViewHolder(inflaeView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bindViewHolder(item)
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        private var view: View = v

        fun bindViewHolder(item: RecyclerViewItem) {
            view.apply {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.ic_launcher_background)
                findViewById<TextView>(R.id.textView).text = item.name
            }
        }
    }
}