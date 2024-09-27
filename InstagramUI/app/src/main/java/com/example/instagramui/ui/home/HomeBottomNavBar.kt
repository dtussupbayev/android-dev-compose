package com.example.instagramui.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.instagramui.R


@Composable
fun HomeBottomNavBar() {
    Column {
        HorizontalDivider()
        BottomAppBar(
            containerColor = MaterialTheme.colorScheme.background
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.home_icon),
                    contentDescription = "Home",
                    modifier = Modifier.size(24.dp)
                )
                Icon(
                    painter = painterResource(id = R.drawable.search_icon),
                    contentDescription = "Search",
                    modifier = Modifier.size(24.dp)
                )
                Icon(
                    painter = painterResource(id = R.drawable.add_icon),
                    contentDescription = "Add Post",
                    modifier = Modifier.size(24.dp)
                )
                Icon(
                    painter = painterResource(id = R.drawable.reels_icon),
                    contentDescription = "Notifications",
                    modifier = Modifier.size(24.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.blank_profile),
                    contentDescription = null,
                    modifier = Modifier
                        .size(28.dp)
                        .clip(CircleShape)
                )
            }
        }
    }
}
