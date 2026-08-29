package com.example.jetpackcomposetutorial.`3_Layouts`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LazyRowsExampel() {


    Column(Modifier.fillMaxSize().padding(12.dp).background(Color.Blue),
        verticalArrangement = Arrangement.Center) {
        LazyRow(Modifier.fillMaxWidth().height(200.dp).background(Color.LightGray).padding(1.dp),
            verticalAlignment = Alignment.CenterVertically) {

            items(100) { Index ->
                Text(
                    "Hello $Index ",
                    modifier = Modifier.fillMaxWidth().padding(5.dp).background(Color.White).padding(5.dp),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}