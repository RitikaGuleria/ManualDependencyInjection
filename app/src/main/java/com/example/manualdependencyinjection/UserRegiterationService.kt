package com.example.manualdependencyinjection

import android.provider.ContactsContract.CommonDataKinds.Email

class UserRegiterationService(private val userRepository: UserRepository,
                              private val emailService: EmailService)
{

    fun RegisterUser(email:String,password:String){
        userRepository.SaveUser(email, password)
        emailService.Send(email,"rg@gmail.com","Hi guys! It's an email body")
    }

}