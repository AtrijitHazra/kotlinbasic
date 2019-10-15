package com.kotlinsample.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kotlinsample.R

class ChatAdapter(val chatList : ArrayList<String>): RecyclerView.Adapter<ChatAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.row_chat,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (position%2==0) {
            holder.tvRight.visibility  = View.GONE
            holder.tvLeft.visibility  = View.VISIBLE

        }
        else {
            holder.tvLeft.visibility = View.GONE
            holder.tvRight.visibility = View.VISIBLE
        }

    }

    override fun getItemCount(): Int {
        return 50
    }


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvRight : TextView = itemView.findViewById(R.id.tvRight)
        var tvLeft : TextView = itemView.findViewById(R.id.tvLeft)


    }
}