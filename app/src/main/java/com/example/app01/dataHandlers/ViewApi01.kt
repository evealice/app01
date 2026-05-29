package com.example.app01.dataHandlers

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay

class ViewApi01 : ViewModel() {

    var situation by mutableStateOf<DataApi01?>(null)
        private set

    init {
        startPolling()
    }

    private fun startPolling() {

        viewModelScope.launch {

            while (true) {

                try {
                    situation = CallApi01.api.getSituation()
                } catch (e: Exception) {
                    e.printStackTrace()
                }

                delay(2000)
            }
        }
    }
}