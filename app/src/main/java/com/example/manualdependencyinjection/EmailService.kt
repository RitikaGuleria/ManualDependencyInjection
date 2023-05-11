package com.example.manualdependencyinjection

import android.util.Log

class EmailService {

    fun Send(to:String,from:String,body:String?)
    {
        Log.d("log","Email Sent!!")
    }
}