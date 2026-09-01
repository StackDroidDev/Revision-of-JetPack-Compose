package com.example.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.jetpackcomposetutorial.`2_CoreComponents`.OutlinedButtonSample
import com.example.jetpackcomposetutorial.`7_NavBAr`.NavGraph
import com.example.jetpackcomposetutorial.`7_NavBAr`.NavHomeScreen

import com.example.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate Executed")
        enableEdgeToEdge()
        setContent {
            JetpackComposeTutorialTheme {

                OutlinedButtonSample()



            }
        }
    }
    override fun onStart() {
        super.onStart()
        println("onStart Executed")
    }

    override fun onResume() {
        println("onResume Executed")
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
        println("onPause Executed")
    }

    override fun onStop() {
        super.onStop()
        println("onStop Executed")
    }

    override fun onRestart() {
        super.onRestart()
        println("onRestart Executed")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy Executed")
    }
}

