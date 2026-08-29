package com.example.jetpackcomposetutorial.`2_CoreComponents`

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink

@Composable
fun PartiallySelectabletext() {

    Column(Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        SelectionContainer() {
            Text("This is selectable text")
        }
        DisableSelection {
            Text("This Text is not selectable")
        }
    }
}

@Composable
fun attachingLinkOnAText() {
    val uriHandler = LocalUriHandler.current

    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
    {
        Text(
            buildAnnotatedString {
                append("This is my NST portfollio :  ")

                val link = LinkAnnotation.Url(
                    "https://my.newtonschool.co/coding-nsat/timeline?utm_referer=codingnsat",
                    TextLinkStyles(
                        SpanStyle(
                            color = Color.Red
                        )
                    )
                ) {
                    val url = (it as LinkAnnotation.Url).url
                    uriHandler.openUri(url)
                }
                withLink(link)
                {
                    append("NST")
                }

            }
        )
    }
}