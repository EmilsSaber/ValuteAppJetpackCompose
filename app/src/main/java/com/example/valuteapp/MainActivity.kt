package com.example.valuteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.valuteapp.navigation.NavHost
import com.example.valuteapp.presentation.mainFlowScreen.MainFlowScreen
import com.example.valuteapp.ui.theme.ValuteAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ValuteAppTheme {
                MainFlowScreen()
            }
        }
    }
}