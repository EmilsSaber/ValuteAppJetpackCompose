package com.example.valuteapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun PurchaseSale() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                8.dp,
                top = 24.dp,
                end = 12.dp
            ),
        horizontalArrangement = Arrangement.SpaceEvenly,
    ) {
        Purchase()
        Text(text = "09 июня 2023 09:30", color = Color.White)
        Sale()
    }
}

@Composable
private fun Purchase() {
    Column(
        modifier = Modifier
            .padding(
                top = 12.dp
            )
            .height(70.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Покупка", color = Color.White)
    }
}

@Composable
private fun Sale() {
    Column(
        modifier = Modifier
            .padding(
                top = 12.dp
            )
            .height(70.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Продажа", color = Color.White)
    }
}



