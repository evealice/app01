package com.example.app01.screenComponents

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.app01.dataHandlers.ViewApi01

@Composable
fun CardInfo(viewModel: ViewApi01){

    val data = viewModel.situation

    Column {

        data?.data?.rule_hits?.forEach { hit ->

            Text(
                text = hit.message,
                fontSize = 18.sp,
                color = Color.Black,
                textAlign = TextAlign.Left
            )
        }
    }
}

