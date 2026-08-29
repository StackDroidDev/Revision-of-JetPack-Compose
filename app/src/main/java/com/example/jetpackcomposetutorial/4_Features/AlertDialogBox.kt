package com.example.jetpackcomposetutorial.`4_Features`


import android.app.VoiceInteractor
import android.media.tv.AdRequest
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DialogBoxExample(
//    onDismissRequest: ()-> Unit,
//    onConfirmationRequest: ()-> Unit,
//    painter: Painter
) {

            val onDismissRequest = Unit
    Dialog(
        onDismissRequest = {
            onDismissRequest
        }
    )
    {
        Card(
            Modifier.fillMaxWidth().height(100.dp)
        ) {

            Text("This is an dialog Box Example",
                modifier = Modifier.fillMaxWidth().padding(top = 12.dp), textAlign = TextAlign.Center)

            Row(Modifier.fillMaxWidth().padding(12.dp),horizontalArrangement = Arrangement.Center) {
                Text(
                    "confirm", modifier = Modifier.clickable(enabled = true, onClick = {}), color = Color.Blue
                )
                Spacer(Modifier.width(12.dp))
                Text(
                    "Decline", modifier = Modifier.clickable(enabled = true, onClick = {}),color = Color.Red
                )



            }

        }
    }
        }