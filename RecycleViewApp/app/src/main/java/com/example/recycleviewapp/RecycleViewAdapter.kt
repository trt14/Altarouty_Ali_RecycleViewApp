package com.example.recyclerviewapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewapp.R
import kotlinx.android.synthetic.main.item_row.view.*

class RecycleViewAdapter(private val myList: List<String>): RecyclerView.Adapter<RecycleViewAdapter.ItemViewHolder>(){
    class ItemViewHolder (itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val list = myList[position]

        holder.itemView.apply {
            tvtxt.text = list


        }
    }

    override fun getItemCount() = myList.size
}