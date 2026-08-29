package com.example.jetpackcomposetutorial.`2_CoreComponents`

import android.widget.Toast
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

@Composable
fun FilledButtonSample() {

    val context = LocalContext.current
    Button(
        onClick = {
            Toast.makeText(context, "Buttoon is clicked", Toast.LENGTH_SHORT).show()
        }
    ) {
        Text("Button")
    }
}

@Composable
fun TonalButtonSample() {
    val context = LocalContext.current
    FilledTonalButton(onClick = {
        Toast.makeText(context, "Buttoon is clicked", Toast.LENGTH_SHORT).show()
    }) {
        Text("Button")
    }
}



@Composable
fun OutlinedButtonSample() {
    val context = LocalContext.current
    FilledTonalButton(onClick = {
        Toast.makeText(context, "Buttoon is clicked", Toast.LENGTH_SHORT).show()
    }) {
        Text("Button")
    }
}


@Composable
fun ElevatedButtonSample() {
    val context = LocalContext.current
    ElevatedButton(onClick = {
        Toast.makeText(context, "Buttoon is clicked", Toast.LENGTH_SHORT).show()
    }) {
        Text("Button")
    }
}


@Composable
fun TextButtonSample() {
    val context = LocalContext.current
    TextButton(onClick = {
        Toast.makeText(context, "Buttoon is clicked", Toast.LENGTH_SHORT).show()
    }) {
        Text("Button")
    }
}

