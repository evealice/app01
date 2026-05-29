package com.example.app01.screenComponents

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.app01.dataHandlers.ViewApi01
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun ScreenMain(viewModel: ViewApi01 = viewModel()) {

    Column(
        modifier = Modifier.fillMaxSize().padding(vertical = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        CardWarning()
        CardInfo(viewModel)
        CardBig(viewModel)
        CardMap()
        // CardApi()
        // CardTest()
        // CardInfo(modifier = Modifier.weight(1f))
    }
}


