package com.example.jetpackcomposetutorial.`5_Navigation`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun HomeScreenExample(navController: NavHostController) {

    Box(Modifier
        .fillMaxSize()
        .background(Color.LightGray), contentAlignment = Alignment.Center)

    {
        Column(
            Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("This is Home Page")
            Button(onClick = {
                navController.navigate(NavRoutes.LoginScreen)
            }, Modifier
                .fillMaxWidth()
                .padding(horizontal = 70.dp)) {

                Text(
                    "Next",
                    color = Color.White
                )
            }
        }
    }
}

