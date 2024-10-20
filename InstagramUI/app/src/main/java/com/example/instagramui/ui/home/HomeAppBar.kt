package com.example.instagramui.ui.home

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.instagramui.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeAppBar(scrollBehavior: TopAppBarScrollBehavior) {
    TopAppBar(
        scrollBehavior = scrollBehavior,
        title = {
            Text(
                "Instagram", Modifier
                    .fillMaxWidth(),
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.titleLarge
            )
        },
        actions = {
            IconButton(onClick = { }) {
                Icon(
                    painter = painterResource(R.drawable.like_icon),
                    contentDescription = "Like Icon",
                    modifier = Modifier.size(24.dp)
                )
            }
            IconButton(onClick = { }) {
                Icon(
                    painter = painterResource(R.drawable.messenger_icon),
                    contentDescription = "Messenger Icon",
                    modifier = Modifier.size(24.dp)
                )
            }
        }
    )
}
