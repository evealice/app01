package com.example.app01.screenComponents

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import com.example.app01.dataHandlers.CallApi01

@Composable
fun CardTest() {

    var text by remember { mutableStateOf("Loading...") }

    LaunchedEffect(Unit) {
        try {
            val result = CallApi01.api.getSituation()
            text = "${result.data.ownship.lat} / ${result.data.ownship.lon}"
        } catch (e: Exception) {
            text = "Error: ${e.message}"
        }
    }

    Text(text = text)
}



