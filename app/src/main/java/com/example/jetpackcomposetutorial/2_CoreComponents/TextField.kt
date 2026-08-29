package com.example.jetpackcomposetutorial.`2_CoreComponents`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun OutlinedTextFieldExample() {
    var text by remember {
        mutableStateOf("")
    }


    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

        OutlinedTextField(
            value = text,
            onValueChange = {
                text = it
            },
            label = { Text("Enter your name") }
        )
    }
}

@Composable
fun TextFieldExample() {
    var text by remember {
        mutableStateOf("")
    }

    var ColorCombinations = listOf(
        Color.Blue,
        Color.Cyan,
        Color.Red,
        Color.Magenta,
        Color.Green,
        Color.Gray,
    )

    val brushing = remember {
        Brush.sweepGradient(colors = ColorCombinations)
    }

    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

        OutlinedTextField(
            value = text,
            onValueChange = {
                text = it
            },
            textStyle = TextStyle(brush = brushing)


        )
    }

}

@Composable
fun PasswordTextfieldExample() {
    var Password by rememberSaveable() {
        mutableStateOf("")
    }



    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

        TextField(
            value = Password,
            onValueChange = {
                Password = it
            },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password
            )


        )
    }
    
}

@Preview(showBackground = true)
@Composable
fun OutlinedTextFieldExamplePreview() {
    TextFieldExample()
}