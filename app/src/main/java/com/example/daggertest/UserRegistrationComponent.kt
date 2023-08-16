package com.example.daggertest

import dagger.Component
import javax.inject.Inject

@Component
interface UserRegistrationComponent {
    fun myInject(mainActivity: MainActivity)
}