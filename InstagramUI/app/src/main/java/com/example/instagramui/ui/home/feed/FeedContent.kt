package com.example.instagramui.ui.home.feed

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.instagramui.data.PostModel
import com.example.instagramui.data.feedPosts
import com.example.instagramui.ui.home.stories.Stories

@Composable
fun FeedContent(modifier: Modifier = Modifier, posts: List<PostModel>) {
    LazyColumn(
        modifier = modifier
    ) {
        item {
            Stories(posts)
        }
        items(posts) { post ->
            PostItem(post)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewFeedContent() {
    FeedContent(
        modifier = Modifier,
        feedPosts
    )
}