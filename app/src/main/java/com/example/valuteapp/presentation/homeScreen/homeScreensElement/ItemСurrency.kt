package com.example.valuteapp.presentation.homeScreen.homeScreensElement

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
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
import com.example.valuteapp.R
import com.example.valuteapp.model.Currency
import com.example.valuteapp.model.NameCurrency

@Preview
@Composable
fun ItemCurrency() {

    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
    ) {
        PreviewValueCurrency()
        PreviewNameCurrency()
        PreviewValueCurrency()
    }
}

@Composable
private fun PreviewValueCurrency() {
    val currencies = listOf(
        Currency(rate = 443.5f),
        Currency(rate = 443.5f),
        Currency(rate = 443.5f),
        Currency(rate = 443.5f),
        Currency(rate = 443.5f),
        Currency(rate = 443.5f),
        Currency(rate = 443.5f)
    )
    CurrencyValueList(currencies = currencies)
}

@Composable
private fun PreviewNameCurrency() {
    val currencyName = listOf(
        NameCurrency(nameCurrency = "USD"),
        NameCurrency(nameCurrency = "EUR"),
        NameCurrency(nameCurrency = "RUB"),
        NameCurrency(nameCurrency = "KGS"),
        NameCurrency(nameCurrency = "GBR"),
        NameCurrency(nameCurrency = "CNY"),
        NameCurrency(nameCurrency = "COLD"),
    )
    CurrencyNameList(currencyName = currencyName)
}

@Composable
private fun CardCurrencyValue(currency: Currency) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .width(95.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Text(
            color = colorResource(id = R.color.lowBlue),
            text = "${currency.rate}",
            style = TextStyle(fontWeight = FontWeight.Bold),
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}

@Composable
private fun CardCurrencyName(currencyName: NameCurrency) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .width(95.dp)
    ) {
        Text(
            style = TextStyle(fontWeight = FontWeight.Bold),
            color = colorResource(id = R.color.white),
            text = "${currencyName.nameCurrency}",
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}

@Composable
private fun CurrencyValueList(currencies: List<Currency>) {
    LazyColumn {
        items(currencies) { currency ->
            CardCurrencyValue(currency = currency)
        }
    }
}

@Composable
private fun CurrencyNameList(currencyName: List<NameCurrency>) {
    LazyColumn {
        items(currencyName) { currency ->
            CardCurrencyName(currencyName = currency)
        }
    }
}