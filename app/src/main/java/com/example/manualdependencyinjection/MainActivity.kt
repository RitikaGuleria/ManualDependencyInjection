package com.example.manualdependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userRepository=UserRepository()
        val emailService=EmailService()

        val userRegiterationService=UserRegiterationService(userRepository,emailService)
        userRegiterationService.RegisterUser("r@gmail.com","123")
    }
}