package com.example.valuteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ValuteBackground()
        }
    }

    @Preview
    @Composable
    private fun ValuteBackground() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = colorResource(R.color.lowBlue))
                .padding(vertical = 32.dp)
        ) {
            TopPart()
            PurchaseSale()
            ItemCurrency()
            Text(
                color = colorResource(R.color.white),
                text = "Смотреть Больше",
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .padding(top = 32.dp)
            )
        }
    }
}