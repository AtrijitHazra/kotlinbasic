package com.kotlinsample.viewmodels

import android.content.Context
import android.content.Intent
import androidx.core.app.ActivityCompat
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth
import com.kotlinsample.view.activity.LoginActivity
import java.util.*

class LoginViewModel : ViewModel() {

    var context: Context? = null;
    var LoginActivity: LoginActivity? = null;
    private lateinit var auth: FirebaseAuth
    val RC_SIGN_IN = 10


    fun getAuthVar(): FirebaseAuth {
        auth = FirebaseAuth.getInstance()
        return auth;
    }


}