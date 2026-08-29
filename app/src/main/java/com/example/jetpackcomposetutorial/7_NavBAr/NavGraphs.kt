package com.example.jetpackcomposetutorial.`7_NavBAr`

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavGraph() {

    val NavController = rememberNavController()

    NavHost(
        navController = NavController,
        startDestination = NavRoutes.Home
    ){
        composable<NavRoutes.Home> {
            NavHomeScreen(NavController)
        }
        composable<NavRoutes.Search> {
            NavSearchScreen(NavController)
        }
        composable<NavRoutes.Notification> {

            NavNotificationScreen(NavController)
        }
        composable<NavRoutes.Profile> {
            NavProfileScreen(NavController)
        }
    }
}