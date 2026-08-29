package com.example.jetpackcomposetutorial.`7_NavBAr`

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController


@Composable
fun NavSearchScreen(NavController: NavHostController) {

    Scaffold(bottomBar = {NavBar(NavController,"Search")})
    { innerpadding ->

        Column(Modifier.fillMaxSize().padding(innerpadding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Text("Search Screen")
        }
    }
}