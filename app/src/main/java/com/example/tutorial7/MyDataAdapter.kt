package com.example.tutorial7

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyDataAdapter(private val data:List<Post>): RecyclerView.Adapter<MyDataVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyDataVH {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view: View = layoutInflater
            .inflate(R.layout.activity_list_item_view, parent, false)
        return MyDataVH(view,parent)
    }
    override fun getItemCount(): Int {
        return data.size
    }
    override fun onBindViewHolder(holder: MyDataVH, position: Int) {
        val singleData = data[position]
        var toggle = true
        holder.tvUserName.text = singleData.userName
        holder.tvDescription.text = singleData.description
        holder.Likebtn.text = "${singleData.likes} "
        holder.Likebtn.setOnClickListener {

            if (toggle) {
                holder.Likebtn.text = "${singleData.likes + 1} "
                toggle = false
            } else {
                holder.Likebtn.text = "${singleData.likes} "
                toggle = true
            }
        }
    }
}