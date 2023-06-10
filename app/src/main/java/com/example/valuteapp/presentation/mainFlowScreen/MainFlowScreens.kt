package com.example.valuteapp.presentation.mainFlowScreen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun MainFlowScreen(navController: NavController) {
    MainScreenPreview()
}

@Preview
@Composable
fun MainScreenPreview() {
    Text(text = "Haloooo")
}