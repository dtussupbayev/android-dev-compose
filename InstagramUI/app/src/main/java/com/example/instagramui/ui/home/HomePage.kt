package com.example.instagramui.ui.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.tooling.preview.Preview
import com.example.instagramui.data.feedPosts
import com.example.instagramui.ui.home.feed.FeedContent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePage() {
    val scrollBehavior =
        TopAppBarDefaults.exitUntilCollapsedScrollBehavior(rememberTopAppBarState())
    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = { HomeAppBar(scrollBehavior = scrollBehavior) }) { innerPadding ->
        FeedContent(
            posts = feedPosts, modifier = Modifier.padding(innerPadding),
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
private fun PreviewHomePage() {
    Scaffold(
        topBar = {
            HomeAppBar(
                scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(
                    rememberTopAppBarState()
                )
            )
        },
        modifier = Modifier.fillMaxSize(),
    ) { innerPadding ->
        FeedContent(
            posts = feedPosts, modifier = Modifier.padding(innerPadding)
        )
    }
}