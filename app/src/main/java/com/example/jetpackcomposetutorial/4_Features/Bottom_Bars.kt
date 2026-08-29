package com.example.jetpackcomposetutorial.`4_Features`

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BottomSheetExample() {

    var BottomSheetEx by remember {
        mutableStateOf(false)
    }

    var sheetState = rememberModalBottomSheetState(
        skipPartiallyExpanded = false
    )

    Column(
        Modifier.fillMaxSize().background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = {
                BottomSheetEx = true

            },
            modifier = Modifier.background(color = Color.LightGray, shape = RoundedCornerShape(12.dp))
        ) {
            Text("OPEN", fontWeight = FontWeight.ExtraBold)
        }

        if (BottomSheetEx) {
            ModalBottomSheet(
                onDismissRequest = { BottomSheetEx = false },
                sheetState = sheetState,
                modifier = Modifier.fillMaxHeight()
            ) {

                Text(
                    "HELLO, this is an example of a partial bottom sheet",
                    Modifier.padding(12.dp)
                )
            }
        }
    }


}