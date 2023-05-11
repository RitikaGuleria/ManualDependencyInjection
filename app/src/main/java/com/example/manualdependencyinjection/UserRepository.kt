package com.example.manualdependencyinjection

import android.util.Log

class UserRepository {

    fun SaveUser(email:String, password:String)
    {
        Log.d("log","User saved in DB!!")
    }
}