package com.example.labex3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import com.example.labex3.data.Message
import com.example.labex3.screens.MessageListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val sampleMessages = listOf(
            Message("Joe", "Hi!"),
            Message("Jim", "How are you?"),
            Message("Joe", "Test..1..2...3"),
            Message("Joe", "I hate coding!!!"),
            Message("Joe", "Hi!"),
            Message("Jim", "How are you?"),
            Message("Joe", "Test..1..2...3"),
            Message("Joe", "I hate coding!!!"),
            Message("Joe", "Hi!"),
            Message("Jim", "How are you?"),
            Message("Joe", "Test..1..2...3"),
            Message("Joe", "I hate coding!!!")
        )

        setContent {
            MaterialTheme {
                MessageListScreen(messages = sampleMessages)
            }
        }
    }
}