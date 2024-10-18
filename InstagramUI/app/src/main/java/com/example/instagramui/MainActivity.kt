package com.example.instagramui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.instagramui.ui.navigation.BottomNavigationBar
import com.example.instagramui.ui.navigation.NavHostSetup
import com.example.instagramui.ui.navigation.ScreenRoute
import com.example.instagramui.ui.navigation.bottomNavigationItems
import com.example.instagramui.ui.theme.InstagramUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InstagramUITheme {
                var selectedItemIndex by rememberSaveable { mutableIntStateOf(0) }
                val navController = rememberNavController()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    Scaffold(
                        contentWindowInsets = WindowInsets(0.dp),
                        bottomBar = {
                            BottomNavigationBar(
                                items = bottomNavigationItems,
                                selectedItemIndex = selectedItemIndex,
                                onItemSelected = { index ->
                                    selectedItemIndex = index
                                    when (index) {
                                        0 -> navController.navigate(ScreenRoute.Home.route)
                                        1 -> navController.navigate(ScreenRoute.Search.route)
                                        2 -> navController.navigate(ScreenRoute.Add.route)
                                        3 -> navController.navigate(ScreenRoute.Notifications.route)
                                        4 -> navController.navigate(ScreenRoute.Profile.route)
                                    }
                                }
                            )
                        }
                    ) { NavHostSetup(navController, it) }
                }
            }
        }
    }
}
