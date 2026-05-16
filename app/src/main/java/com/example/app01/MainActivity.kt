package com.example.app01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.app01.ui.theme.App01Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            App01Theme {
                Greeting(name = "meine App01")
            }
        }
    }
}
@Composable
fun Greeting(name: String) {
    Text(text = "Hallohallo $name 👋")
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    App01Theme {
        Greeting("Android")
    }
}