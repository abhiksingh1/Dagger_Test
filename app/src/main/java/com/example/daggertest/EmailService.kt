package com.example.daggertest



import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor(){
    fun send(email: String, password: String?) {
        Log.d(TAG, "Email Sent")
    }
}