package com.example.jetpackcomposetutorial.`7_NavBAr`

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController



@Composable
fun NavBar(NavController: NavHostController, key : String) {

    val items = listOf(
        MyNavitems(title = "Home", icon = Icons.Default.Home, NavRoutes.Home),
        MyNavitems(title = "Search", icon = Icons.Default.Search, NavRoutes.Search),
        MyNavitems(title = "Notification", icon = Icons.Default.Notifications, NavRoutes.Notification),
        MyNavitems(title = "Profile", icon = Icons.Default.Person, NavRoutes.Profile)
    )

    NavigationBar {

            items.forEach{item ->
                NavigationBarItem(
                    selected = item.title == key,
                    onClick = {
                        if (Key != item.route) {
                            NavController.navigate(item.route) {
                                popUpTo(NavController.graph.startDestinationId) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                              },
                    icon = {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.title
                        )
                    },
                    label = {
                        Text(item.title)
                    },
                    alwaysShowLabel = false,
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color.Blue,
                        selectedTextColor = Color.Blue,
                        unselectedIconColor = Color.Gray,
                        indicatorColor = Color.White
                    )
                )
            }

    }

}
data class MyNavitems(

    val title : String,
    val icon : ImageVector,
    val route: NavRoutes
)