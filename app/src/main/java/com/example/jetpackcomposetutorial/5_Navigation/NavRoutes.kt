package com.example.jetpackcomposetutorial.`5_Navigation`

import kotlinx.serialization.Serializable

@Serializable
sealed class NavRoutes {
    @Serializable
    object LoginScreen: NavRoutes()
    @Serializable
    object HomeScreen: NavRoutes()
}