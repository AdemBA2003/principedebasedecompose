package com.example.compose.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun ComposeTheme(content: @Composable () -> Unit) {
    MaterialTheme {
        content()
    }
}
