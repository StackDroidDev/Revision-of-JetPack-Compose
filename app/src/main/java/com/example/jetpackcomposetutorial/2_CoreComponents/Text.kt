package com.example.jetpackcomposetutorial.`2_CoreComponents`

import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun SimpleText() {

        Text(
            "Hello World",
//            color = colorResource(R.color.MYPurple),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 50.sp,
            fontFamily = FontFamily.Cursive,
            fontStyle = FontStyle.Italic,
            style = TextStyle(
                shadow = Shadow(color = Color.Black, blurRadius = 20f)
            )
        )
    }


@Composable
fun ColourfulText() {
    var ColorCombinations = listOf(
        Color.Blue,
        Color.Cyan,
        Color.Red,
        Color.Magenta,
        Color.Green,
        Color.Gray,
    )

        Text(
            text = buildAnnotatedString {
                withStyle(
                    SpanStyle(
                        brush = Brush.sweepGradient(
                            colors = ColorCombinations
                        )
                    )
                )
                {
                    append("This is a colour ful text")
                }
            },
            fontSize = 20.sp
        )

    }


@Composable
fun ScrollingText(
) {
    Text("I'm selfish, impatient and a little insecure. I make mistakes, I am out of control and at times hard to handle. But if you can't handle me at my worst, then you sure as hell don't deserve me",
        Modifier.basicMarquee
            (
                    repeatDelayMillis = 4,
                    velocity = 70.dp
                    ),
        fontSize = 16.sp,
        color = Color.DarkGray)
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BasicTextPreview() {
    Column(Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {


        SimpleText()
        Spacer(Modifier.height(5.dp))
        ColourfulText()
        Spacer(Modifier.height(5.dp))
        ScrollingText()


    }


}