package com.example.labex3.components



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.labex3.data.Message
import androidx.compose.ui.tooling.preview.Preview
@Composable
fun MessageCard(
    message: Message,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.Top
    ) {
        // Red-bordered circular avatar container
        Box(
            modifier = Modifier
                .size(48.dp)
                .border(width = 2.dp, color = Color.Red, shape = CircleShape)
                .padding(2.dp)
                .clip(CircleShape)
                .background(Color.LightGray),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = rememberVectorPainter(image = Icons.Default.AccountCircle),
                contentDescription = "Profile Picture",
                modifier = Modifier.fillMaxSize()
            )
        }

        Spacer(modifier = Modifier.width(12.dp))

        // Sender name and text bubble column
        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(
                text = message.sender,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.DarkGray
            )

            Surface(
                shape = RoundedCornerShape(12.dp),
                color = Color(0xFFF2F2F7),
                shadowElevation = 0.5.dp
            ) {
                Text(
                    text = message.text,
                    fontSize = 15.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
                )
            }
        }
    }
}







@Preview(showBackground = true)
@Composable
fun MessageCardPreview() {
    MessageCard(
        message = Message("Joe", "Hi!")
    )
}