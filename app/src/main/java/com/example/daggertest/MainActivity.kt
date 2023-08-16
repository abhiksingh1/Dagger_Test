package com.example.daggertest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.daggertest.ui.theme.DaggerTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

         val userRegistrationComponent = DaggerUserRegistrationComponent.builder().build()
         val userRegistrationService = userRegistrationComponent.getUserRegistrationService()
         val emailService = userRegistrationComponent.getEmailService()

         userRegistrationService.registerUser("abhimanyu@gmail.com", "1234")
         emailService.send("abhimanyu@gmail.com", "1234")
    }
}
