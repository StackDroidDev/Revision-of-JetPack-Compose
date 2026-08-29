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
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController


@Composable
fun NavProfileScreen(NavController: NavHostController) {

    Scaffold(bottomBar = {NavBar(NavController, "Profile") })
    { innerpadding ->

        Column(Modifier.fillMaxSize().padding(innerpadding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Text("Profile Screen")
        }
    }
}