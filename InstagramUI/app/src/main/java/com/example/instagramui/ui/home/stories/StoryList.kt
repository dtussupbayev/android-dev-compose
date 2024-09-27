package com.example.instagramui.ui.home.stories

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagramui.data.PostModel
import com.example.instagramui.data.feedPosts

@Composable
fun Stories(posts: List<PostModel>) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        modifier = Modifier.padding(4.dp)
    ) {
        item {
            MyStoryItem()
        }
        items(posts) { post -> StoryItem(post) }
    }
}

@Preview
@Composable
private fun PreviewStories() {
    Stories(feedPosts)
}
