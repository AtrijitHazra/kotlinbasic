package com.kotlinsample.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kotlinsample.R
import com.kotlinsample.adapter.ChatAdapter

class ChatActivity : AppCompatActivity() {

    private var ivBack : ImageView?=null
    private var rvChat : RecyclerView?=null
    private var chatAdapter : ChatAdapter?=null
    private var chatList : ArrayList<String> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        ivBack = findViewById(R.id.ivBack)
        ivBack!!.setOnClickListener { onBackPressed() }

        chatAdapter = ChatAdapter(chatList)
        rvChat= findViewById(R.id.rvChat)
        rvChat!!.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        rvChat!!.adapter = chatAdapter


    }
}
