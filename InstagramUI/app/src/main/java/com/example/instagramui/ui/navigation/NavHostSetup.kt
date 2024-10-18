package com.example.instagramui.ui.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.instagramui.ui.add_post.AddPostPage
import com.example.instagramui.ui.home.HomePage
import com.example.instagramui.ui.notifications.NotificationsPage
import com.example.instagramui.ui.profile.ProfilePage
import com.example.instagramui.ui.search.SearchPage

@Composable
fun NavHostSetup(navController: NavHostController, innerPadding: PaddingValues) {
    NavHost(
        navController = navController,
        startDestination = ScreenRoute.Home.route,
        modifier = Modifier.padding(innerPadding)
    ) {
        composable(ScreenRoute.Home.route) { HomePage() }
        composable(ScreenRoute.Search.route) { SearchPage() }
        composable(ScreenRoute.Add.route) { AddPostPage() }
        composable(ScreenRoute.Notifications.route) { NotificationsPage() }
        composable(ScreenRoute.Profile.route) { ProfilePage() }
    }
}