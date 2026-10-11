package com.example.labex3.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.labex3.data.Message
import com.example.labex3.components.MessageCard
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun MessageListScreen(messages: List<Message>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFFBFB)),
        contentPadding = PaddingValues(vertical = 12.dp)
    ) {
        items(messages) { message ->
            MessageCard(message = message)
        }
    }
}




@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MessageListScreenPreview() {
    val sampleMessages = listOf(
        Message("Joe", "Hi!"),
        Message("Jim", "How are you?"),
        Message("Joe", "Test..1..2...3"),
        Message("Joe", "I hate coding!!!"),
        Message("Joe", "Hi!"),
        Message("Jim", "How are you?"),
        Message("Joe", "Test..1..2...3"),
        Message("Joe", "I hate coding!!!")
    )
    MessageListScreen(messages = sampleMessages)
}