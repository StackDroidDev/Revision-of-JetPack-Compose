package com.example.jetpackcomposetutorial.`1_Fundamentals`

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposetutorial.R

//TODO In res file there are

//// drawable -> we store our images.
//// Image file must be small case

@Composable
    fun AccessImage()
    {
    Box(Modifier.fillMaxSize().size(200.dp), contentAlignment = Alignment.Center)
    {
        Image(
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription = stringResource(R.string.app_name)
            )
    }
    }

//TODO Values -> colors : we can define our colour
////     <color name="Colour_Name">#FFFFFFFF</color>

@Composable
fun AccessColor(modifier: Modifier = Modifier) {
    Box(Modifier
        .fillMaxSize()
        .background(colorResource(R.color.MYPurple)))

}

//ToDO -> strings : we can reusable string
//// <string name = "Accesable_Name"> the acutual text </string>

@Composable
fun AccessString()
{
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
    {
        Text(stringResource(R.string.Accesable_Name))
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ResourcePreviews() {
    AccessColor()
    AccessImage()
    AccessString()


}