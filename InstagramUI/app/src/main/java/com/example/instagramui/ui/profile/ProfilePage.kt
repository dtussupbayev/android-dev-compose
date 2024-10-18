package com.example.instagramui.ui.profile

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramui.R
import com.example.instagramui.ui.common.components.PostsGrid
import com.example.instagramui.ui.common.components.UserProfileIcon
import com.example.instagramui.ui.theme.ContainerGrey

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfilePage() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "dtussupbayev", Modifier
                            .fillMaxWidth(),
                        fontWeight = FontWeight.Bold,
                        style = MaterialTheme.typography.titleLarge
                    )
                },
                actions = {
                    IconButton(onClick = { }) {
                        Icon(
                            painter = painterResource(R.drawable.add_icon),
                            contentDescription = "Add Icon",
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    IconButton(onClick = { }) {
                        Icon(
                            painter = painterResource(R.drawable.more_icon),
                            contentDescription = "More Icon",
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(horizontal = 8.dp)
        ) {
            Row(modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp)) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    UserProfileIcon(80.dp)
                    Text(
                        text = "dtussupbayev",
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.sp
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp)
                ) {
                    ProfileCount(count = 18, "публикации")
                    ProfileCount(count = 0, "подписчики")
                    ProfileCount(count = 0, "подписки")
                }
            }
            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = ContainerGrey,
                    contentColor = Color.White
                ),
                content = {
                    Text("Редактировать профиль")
                }
            )
            Spacer(Modifier.height(18.dp))
            val posts = ArrayList<String>()
            (1..18).forEach { index ->
                val post = "https://picsum.photos/id/${index + 50}/200/300"
                posts.add(post)
            }
            PostsGrid(
                posts, modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Composable
fun ProfileCount(count: Int, label: String, modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text("$count", fontWeight = FontWeight.Bold)
        Text(label, fontSize = 13.sp)
    }
}

@Preview
@Composable
private fun ProfilePagePreview() {
    ProfilePage()
}