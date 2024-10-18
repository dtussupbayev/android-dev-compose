package com.example.instagramui.ui.home.stories

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramui.ui.common.components.UserProfileIcon

@Composable
fun MyStoryItem() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        UserProfileIcon(70.dp)
        Text(
            text = "Ваша история",
            fontWeight = FontWeight.Normal,
            fontSize = 13.sp
        )
    }
}