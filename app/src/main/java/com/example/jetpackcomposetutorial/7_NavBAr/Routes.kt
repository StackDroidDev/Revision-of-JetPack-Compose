package com.example.jetpackcomposetutorial.`7_NavBAr`

import kotlinx.serialization.Serializable
@Serializable
sealed class NavRoutes{
    @Serializable
    object Home : NavRoutes()
    @Serializable
    object Search : NavRoutes()
    @Serializable
    object Notification : NavRoutes()
    @Serializable
    object Profile : NavRoutes()
}