package com.example.jetpackcomposetutorial.`3_Layouts`

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RowExample() {
    Row(Modifier
        .fillMaxWidth()
        .height(100.dp),
        horizontalArrangement = Arrangement.Center) {
        Text("Hello1")
        Text("Hello2")
        Text("Hello3")
        Text("Hello4")
        Text("Hello5")

    }
}


@Composable
fun ColumnExample() {
    Column(Modifier
        .fillMaxHeight()
        .width(100.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text("Hello1")
        Text("Hello2")
        Text("Hello3")
        Text("Hello4")
        Text("Hello5")

    }
}

//@Preview()
@Composable
fun ConstraintExample() {
     Column(Modifier.fillMaxWidth()) {


         ConstraintLayout(
             Modifier.fillMaxWidth().height(100.dp).background(color = Color.LightGray)
         ) {
                      val (text1,text2,text3) = createRefs()

             Text("HELLO",
                 modifier = Modifier.constrainAs(text1)
                 {
                     top.linkTo(parent.top, margin = 5.dp)
                     start.linkTo(parent.start, margin = 5.dp)
                 }
             )
             Text("I AM",
                 modifier = Modifier.constrainAs(text2)
                 {
                     start.linkTo(parent.start, margin = 5.dp)
                     end.linkTo(parent.end , margin = 5.dp)
                     top.linkTo(parent.top, margin = 5.dp)
                     bottom.linkTo(parent.bottom , margin = 5.dp)
                 }
             )
             Text("JOEL",
                 modifier = Modifier.constrainAs(text3)
                 {
                     bottom.linkTo(parent.bottom, margin = 5.dp)
                     end.linkTo(parent.end, margin = 5.dp)
                 }
             )
         }


     }
     }
