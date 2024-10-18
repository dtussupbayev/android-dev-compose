package com.example.instagramui.ui.notifications

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramui.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NotificationsPage() {
    Scaffold(topBar = {
        TopAppBar(title = {
            Text(
                "Уведомления", Modifier
                    .fillMaxWidth(),
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.titleLarge
            )
        })
    }) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(mockNotifications.size) { index ->
                val notification = mockNotifications[index]
                NotificationItemRow(notification = notification)
            }
        }
    }
}

@Composable
fun NotificationItemRow(notification: NotificationItem) {
    Row(
        modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(modifier = Modifier.weight(1f)) {
            Image(
                painter = painterResource(id = notification.userAvatar),
                contentDescription = null,
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Column {
                Text(text = "${notification.userName} ${notification.notificationText}")
                Text(
                    text = notification.timeAgo, modifier = Modifier.padding(top = 4.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NotificationsPagePreview() {
    NotificationsPage()
}

data class NotificationItem(
    val userName: String,
    val userAvatar: Int,
    val notificationText: String,
    val timeAgo: String,
)

val mockNotifications = listOf(
    NotificationItem(
        userName = "john_doe",
        userAvatar = R.drawable.user_avatar1,
        notificationText = "лайкнул/ла вашу публикацию.",
        timeAgo = "5мин",
    ),
    NotificationItem(
        userName = "jane_smith",
        userAvatar = R.drawable.user_avatar2,
        notificationText = "оставил/ла коммент: 'Лучшее фото!'",
        timeAgo = "10мин"
    ),
    NotificationItem(
        userName = "michael_b",
        userAvatar = R.drawable.user_avatar3,
        notificationText = "подписался/лась на вас.",
        timeAgo = "20мин"
    ),
)

