package com.example.jetpackcomposetutorial.`2_CoreComponents`

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposetutorial.R


@Preview(showSystemUi = true)
@Composable
fun ImageExamle() {

    Image(
        painter = painterResource(R.drawable.ic_launcher_background),
        contentDescription = "This is a demo",
        contentScale = ContentScale.Crop,
        modifier = Modifier.size(200.dp)
            .border(color=Color.Blue, width = 5.dp, shape = CircleShape)
            .clip(shape = CircleShape),
        colorFilter = ColorFilter.colorMatrix(ColorMatrix().apply {
            setToSaturation(0.2f)
        })
    )

}