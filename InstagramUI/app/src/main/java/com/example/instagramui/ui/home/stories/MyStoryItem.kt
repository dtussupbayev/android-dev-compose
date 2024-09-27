package com.example.instagramui.ui.home.stories

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramui.R

@Composable
fun MyStoryItem() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Box(
            modifier = Modifier
                .size(70.dp)
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
        Text(
            text = "Ваша история",
            fontWeight = FontWeight.Normal,
            fontSize = 13.sp
        )
    }
}