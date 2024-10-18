package com.example.instagramui.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.instagramui.R

sealed class IconType {
    data class DrawableResource(val resId: Int) : IconType()
    data class VectorIcon(val imageVector: ImageVector) : IconType()
}

data class BottomNavigationItem(
    val title: String,
    val icon: IconType
)

val bottomNavigationItems = listOf(
    BottomNavigationItem(
        title = "Home",
        icon = IconType.DrawableResource(R.drawable.home_icon),
    ),
    BottomNavigationItem(
        title = "Search",
        icon = IconType.DrawableResource(R.drawable.search_icon),
    ),
    BottomNavigationItem(
        title = "Add",
        icon = IconType.DrawableResource(R.drawable.add_icon),
    ),
    BottomNavigationItem(
        title = "Notifications",
        icon = IconType.VectorIcon(Icons.Outlined.Notifications),
    ),
    BottomNavigationItem(
        title = "Profile",
        icon = IconType.DrawableResource(R.drawable.blank_profile),
    )
)
