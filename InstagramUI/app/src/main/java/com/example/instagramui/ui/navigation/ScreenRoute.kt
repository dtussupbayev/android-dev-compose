package com.example.instagramui.ui.navigation

sealed class ScreenRoute(val route: String) {
    data object Home : ScreenRoute("home")
    data object Search : ScreenRoute("search")
    data object Add : ScreenRoute("add")
    data object Notifications : ScreenRoute("notifications")
    data object Profile : ScreenRoute("profile")
}