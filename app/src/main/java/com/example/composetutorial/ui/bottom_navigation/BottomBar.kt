package com.example.composetutorial.ui.bottom_navigation

import android.content.res.Configuration
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.composetutorial.model.BottomNavItem
import com.example.composetutorial.ui.theme.ComposeTutorialTheme

@Composable
fun BottomNavigationBar() {
    val navController = rememberNavController()
    val navItems = listOf(
        BottomNavItem("Home", Icons.Default.Home, "home"),
        BottomNavItem("Play", Icons.Default.MusicNote, "play"),
        BottomNavItem("Favourites", Icons.Default.Favorite, "favourites"),
        BottomNavItem("Profile", Icons.Default.Person, "profile")
    )

    Scaffold(
        bottomBar = {
            BottomNavigation(
                backgroundColor = Color.Black,
                contentColor = Color.White,
                modifier = Modifier
                    .height(100.dp)
                    .clip(RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp))
            ) {
                val currentRoute by navController.currentBackStackEntryAsState()
                navItems.forEach { item ->
                    BottomNavigationItem(icon = {
                        Icon(
                            item.icon,
                            contentDescription = item.label,
                            modifier = Modifier.padding(top= 20.dp).size(35.dp)
                        )
                    }, selected = currentRoute?.destination?.route == item.route, onClick = {
                        navController.navigate(item.route) {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }
                    })
                }
            }
        }) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = navItems[0].route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable("home") { HomeScreen() }
            composable("play") { PlayMusicScreen() }
            composable("favourites") { FavouritesScreen() }
            composable("profile") { ProfileScreen() }

        }
    }
}

@Preview(name = "Light Mode")
@Preview(
    showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Dark Mode"
)
@Composable
fun GreetingPreview() {
    ComposeTutorialTheme {
        Surface {
            BottomNavigationBar()
        }
    }
}






