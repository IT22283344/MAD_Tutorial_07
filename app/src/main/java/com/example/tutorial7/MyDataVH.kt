package com.example.tutorial7

import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyDataVH(itemView: View,parent:ViewGroup) : RecyclerView.ViewHolder(itemView) {
    val hSize = parent.measuredWidth /2
    val vSize = parent.measuredHeight /2

    init {
        itemView.layoutParams.height = vSize - 16
        itemView.layoutParams.width = hSize - 16
    }
    val tvUserName:TextView = itemView.findViewById(R.id.tvUsername)
    val tvDescription:TextView = itemView.findViewById(R.id.tvDescription)
    val Likebtn:Button = itemView.findViewById(R.id.Likebtn)
    var toggle: Boolean = true

}
