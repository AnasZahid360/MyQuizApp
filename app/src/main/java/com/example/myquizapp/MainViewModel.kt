package com.example.myquizapp

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel: ViewModel() {

    private val  _isReady = MutableStateFlow(false)
    val isReady = _isReady.asStateFlow()

    init {
        viewModel.launch
    }
}