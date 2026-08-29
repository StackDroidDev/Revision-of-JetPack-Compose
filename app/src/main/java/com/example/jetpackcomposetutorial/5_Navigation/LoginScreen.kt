package com.example.jetpackcomposetutorial.`5_Navigation`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun LoginScreenExample(navController: NavHostController) {

    var Username by remember {
        mutableStateOf("")
    }
    var UserEmail by remember {
        mutableStateOf("")
    }

    Box(Modifier
        .fillMaxSize()
        .padding(10.dp)
        .background(color = Color(0xFFE6E0F8)))
    {
        Column(
            Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            OutlinedTextField(
                value = Username, onValueChange =
                    {
                        Username = it
                    },
                modifier = Modifier.fillMaxWidth().padding(20.dp),
                shape = CircleShape,
                placeholder = {
                    Text("Name")
                },
                colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color.White, focusedContainerColor = Color(0xFFECECEC)))
            OutlinedTextField(
                value = UserEmail, onValueChange =
                    {
                        UserEmail = it
                    },
                modifier = Modifier.fillMaxWidth().padding(20.dp),
                shape = CircleShape,
                placeholder = {
                    Text("Email")
                },
                colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color.White, focusedContainerColor = Color(0xFFECECEC)))

            Button(onClick = {
                navController.navigate(NavRoutes.HomeScreen)
            }, Modifier.fillMaxWidth().padding(horizontal = 70.dp)) {

                Text("Next",
                    color = Color.White)
            }
        }
    }
}


