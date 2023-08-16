package com.example.daggertest

import android.content.ContentValues
import android.util.Log

class UserRegistrationService(
    private val userRepository: UserRepository,
    private val emailService: EmailService
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        emailService.send(email, password)
    }
}