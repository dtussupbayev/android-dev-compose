package com.example.instagramui.ui.common.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.instagramui.R

@Composable
fun UserProfileIcon(size: Dp, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .size(size)
            .clickable(onClick = {})
    ) {
        Image(
            painter = painterResource(id = R.drawable.blank_profile),
            contentDescription = null,
            modifier = Modifier.clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Icon(
            Icons.Default.AddCircle,
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.BottomEnd),
            tint = Color(0xFF2196F3)
        )
    }
}

@Preview
@Composable
private fun UserProfileIconPreview() {
    UserProfileIcon(70.dp)
}