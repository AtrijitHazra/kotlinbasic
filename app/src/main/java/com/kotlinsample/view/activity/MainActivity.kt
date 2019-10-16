package com.kotlinsample.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.auth.FirebaseAuth
import com.kotlinsample.R
import com.kotlinsample.adapter.UserListAdapter
import com.kotlinsample.interfaces.OnItemClicks

class MainActivity : AppCompatActivity() , OnItemClicks {


    private var ivBack : ImageView ?=null
    private var ivLogout : ImageView ?=null
    private var recyclerView : RecyclerView ?=null
    private var userListAdapter : UserListAdapter ?=null
    private var userNameList : ArrayList<String> = ArrayList()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ivBack = findViewById(R.id.ivBack)
        ivBack!!.setOnClickListener { onBackPressed() }


        ivLogout = findViewById(R.id.ivLogout)
        ivLogout!!.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            startActivity(Intent(this,LoginActivity::class.java))
            finish()

        }

        recyclerView = findViewById(R.id.recyclerView)

        userListAdapter = UserListAdapter(userNameList,this )
        recyclerView!!.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        recyclerView!!.adapter = userListAdapter;


    }

    override fun onItemClick(position: Int) {
        startActivity(Intent(this, ChatActivity::class.java ))
    }
}
