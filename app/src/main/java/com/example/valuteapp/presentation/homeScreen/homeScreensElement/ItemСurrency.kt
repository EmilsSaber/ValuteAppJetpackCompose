package com.example.valuteapp.presentation.homeScreen.homeScreensElement

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.valuteapp.R
import com.example.valuteapp.model.Currency
import com.example.valuteapp.model.NameCurrency

@Composable
fun ItemCurrency(onItemClick: (Float) -> Unit) {
    ItemCurrencyPreview(onItemClick)
}
@Composable
private fun CardCurrencyValue(currency: Currency,  onItemClick: () -> Unit) {
    Box(
        modifier = Modifier
            .background(color = Color.White, shape = RoundedCornerShape(8.dp))
            .height(42.dp)
            .width(86.dp)
            .clickable { onItemClick() },
        contentAlignment = Alignment.Center
    ) {
        Text(
            color = colorResource(id = R.color.lowBlue),
            text = "${currency.rate}",
            style = TextStyle(fontWeight = FontWeight.Bold),
            fontSize = 18.sp
        )
    }
}

@Composable
private fun CardCurrencyName(currencyName: NameCurrency) {
    Column(
        modifier = Modifier
            .width(86.dp)
            .height(42.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally),
            color = colorResource(id = R.color.white),
            text = "${currencyName.nameCurrency}",
            style = TextStyle(fontWeight = FontWeight.Bold),
            fontSize = 18.sp
        )
    }
}

@Preview
@Composable
 fun ItemCurrencyPreview(onItemClick: (Float) -> Unit= {}) {
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(16.dp),

        ) {
        items(currencies.size) { index ->
            val currency = currencies[index]
            val name = currencyName[index]

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                CardCurrencyValue(currency = currency) {
                    onItemClick(currency.rate)
                    Log.d("ololo", "Clicked on currency: ${currency.rate}")

                }

                CardCurrencyName(currencyName = name)

                CardCurrencyValue(currency = currency) {
                    onItemClick(currency.rate)
                    Log.d("ololo", "Clicked on currency: ${currency.rate}")
                }
            }
        }
    }
}
