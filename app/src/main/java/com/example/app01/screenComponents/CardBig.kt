package com.example.app01.screenComponents

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.style.TextAlign
import com.example.app01.dataHandlers.ViewApi01

@Composable
fun CardBig(viewModel: ViewApi01) {

    val data = viewModel.situation

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = if (data != null)
                "${"%.4f".format(data.data.ownship.lat)} , ${"%.4f".format(data.data.ownship.lon)}\n" +
                "${data.data.ownship.sog_kn} kn"
            else
                "Loading...",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            lineHeight = 42.sp,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red,
                contentColor = Color.White
            )
        ) {
            Text(
                text = "ALL HANDS ON DECK",
                fontWeight = FontWeight.Bold
            )
        }
    }
}


