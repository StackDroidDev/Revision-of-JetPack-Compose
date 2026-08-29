package com.example.jetpackcomposetutorial.`5_Navigation`

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavRoutes.LoginScreen
    ){
        composable<NavRoutes.LoginScreen>
        {
            LoginScreenExample(navController)
        }
        composable<NavRoutes.HomeScreen>
        {
            HomeScreenExample(navController)
        }
    }
}