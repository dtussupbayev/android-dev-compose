package com.example.instagramui.ui.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.instagramui.data.feedPosts
import com.example.instagramui.ui.home.feed.FeedContent

@Composable
fun HomePage() {
    Scaffold(topBar = { HomeAppBar() },
        bottomBar = { HomeBottomNavBar() }) { innerPadding ->
        FeedContent(
            posts = feedPosts, modifier = Modifier.padding(innerPadding),
        )
    }
}

@Preview
@Composable
private fun PreviewHomePage() {
    Scaffold(
        topBar = { HomeAppBar() },
        bottomBar = { HomeBottomNavBar() },
        modifier = Modifier.fillMaxSize(),
    ) { innerPadding ->
        FeedContent(
            posts = feedPosts, modifier = Modifier.padding(innerPadding)
        )
    }
}