package com.example.instagramui.ui.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun BottomNavigationIcon(item: BottomNavigationItem) {
    when (item.icon) {
        is IconType.DrawableResource -> {
            if (item.title == "Profile") {
                Image(
                    painter = painterResource(id = item.icon.resId),
                    contentDescription = item.title,
                    modifier = Modifier
                        .size(28.dp)
                        .clip(CircleShape)
                )
            } else {
                Icon(
                    painter = painterResource(id = item.icon.resId),
                    contentDescription = item.title,
                    modifier = Modifier.size(24.dp)
                )
            }
        }

        is IconType.VectorIcon -> {
            Icon(
                imageVector = item.icon.imageVector,
                contentDescription = item.title,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}
