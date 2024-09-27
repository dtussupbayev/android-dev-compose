package com.example.instagramui.ui.home.feed

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.instagramui.R
import com.example.instagramui.data.PostModel
import com.example.instagramui.data.feedPosts

@Composable
fun PostItem(post: PostModel) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        PostHeader(post)
        PostImage(post.imageResId)
        PostActions(post)
        PostTextSection(post)
        PostFooter(post)
    }
}

@Composable
fun PostHeader(post: PostModel) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = post.avatarResId),
                contentDescription = null,
                modifier = Modifier
                    .size(44.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = post.username,
                style = MaterialTheme.typography.titleSmall
            )
        }
        Icon(
            imageVector = Icons.Default.MoreVert,
            contentDescription = null
        )
    }
}

@Composable
fun PostImage(imageResId: Int) {
    Image(
        painter = painterResource(id = imageResId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxWidth()
            .height(325.dp)
    )
}

@Composable
fun PostActions(post: PostModel) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        PostActionIcon(iconResId = R.drawable.like_icon, count = post.likesCount)
        Spacer(modifier = Modifier.width(16.dp))
        PostActionIcon(
            iconResId = R.drawable.comment_icon,
            count = post.commentsCount,
            iconSize = 28.dp
        )
        Spacer(modifier = Modifier.width(16.dp))
        PostActionIcon(iconResId = R.drawable.send_icon, count = post.repostsCount)
        Spacer(modifier = Modifier.weight(1f))
        Icon(
            painter = painterResource(id = R.drawable.bookmark_icon),
            contentDescription = null,
            modifier = Modifier.size(24.dp)
        )
    }
}

@Composable
fun PostActionIcon(iconResId: Int, count: Int, iconSize: Dp = 24.dp) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            painter = painterResource(id = iconResId),
            contentDescription = null,
            modifier = Modifier.size(iconSize)
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = count.toString(),
            style = MaterialTheme.typography.bodySmall
        )
    }
}

@Composable
fun PostTextSection(post: PostModel) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 4.dp)
    ) {
        Text(
            text = post.username,
            style = MaterialTheme.typography.bodySmall.copy(fontWeight = FontWeight.Bold),
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = post.text,
            style = MaterialTheme.typography.bodySmall,
        )
    }
}

@Composable
fun PostFooter(post: PostModel) {
    Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)) {
        Text(
            text = "Смотреть все комментарии",
            style = MaterialTheme.typography.bodySmall,
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = post.timeAgo,
            style = MaterialTheme.typography.bodySmall,
            color = Color.Gray
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPostItem() {
    PostItem(
        feedPosts[1]
    )
}