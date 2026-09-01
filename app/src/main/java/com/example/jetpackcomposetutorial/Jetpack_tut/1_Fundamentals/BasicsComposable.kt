package com.example.jetpackcomposetutorial.Jetpack_tut.`1_Fundamentals`

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BasicText(name: String) {
    Text(
        text = (name)
    )

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BasicTextPreview() {
    BasicText("Hello Joel")

}