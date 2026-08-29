package com.example.jetpackcomposetutorial.Practice

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable

@Serializable
sealed class MyNavRoutes {
    @Serializable
    object LoginScreen : MyNavRoutes()

    @Serializable
    object HomeScreen : MyNavRoutes()
}

@Composable
fun NavGraph2() {
    val NavController = rememberNavController()

    NavHost(
        navController = NavController,
        startDestination = MyNavRoutes.LoginScreen
    )
    {
        composable<MyNavRoutes.LoginScreen>
        {
            LoginScreen2(NavController)
        }
        composable<MyNavRoutes.HomeScreen>
        {
            HomeScreen2()
        }
    }
}

