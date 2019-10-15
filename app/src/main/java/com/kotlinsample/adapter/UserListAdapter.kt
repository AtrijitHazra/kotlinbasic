package com.kotlinsample.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kotlinsample.R
import com.kotlinsample.adapter.UserListAdapter.*
import com.kotlinsample.interfaces.OnItemClicks

class UserListAdapter(val userNames: ArrayList<String>, onItemClick : OnItemClicks): RecyclerView.Adapter<ViewHolder>() {
    private var onItemClick : OnItemClicks ?= onItemClick


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder( LayoutInflater.from(parent.context).inflate(R.layout.row_user_list,parent,false))
    }

    override fun getItemCount(): Int {
       return 10
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        holder.tvUserName.text= userNames.get(position)
        holder.tvUserName.setOnClickListener{onItemClick!!.onItemClick(position)}
    }


    class ViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        var ivUserImage : ImageView = itemView.findViewById(R.id.ivUserImage);
        val tvUserName : TextView = itemView.findViewById(R.id.tvUserName)

    }

}