package com.niojar.bankexample

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AttachMoney
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.niojar.bankexample.data.Currency

val currencies = listOf(
    Currency(
        name = "USD",
        buy = 23.52f,
        sell = 23.55f,
        icon = Icons.Rounded.AttachMoney
    ),
    Currency(
        name = "EUR",
        buy = 25.52f,
        sell = 13.55f,
        icon = Icons.Rounded.AttachMoney
    ),
    Currency(
        name = "GBP",
        buy = 43.52f,
        sell = 33.55f,
        icon = Icons.Rounded.AttachMoney
    ),
    Currency(
        name = "JPY",
        buy = 34.52f,
        sell = 33.55f,
        icon = Icons.Rounded.AttachMoney
    ),
    Currency(
        name = "AUD",
        buy = 13.52f,
        sell = 23.55f,
        icon = Icons.Rounded.AttachMoney
    ),
    Currency(
        name = "CAD",
        buy = 13.52f,
        sell = 13.55f,
        icon = Icons.Rounded.AttachMoney
    ),
    Currency(
        name = "CHF",
        buy = 33.52f,
        sell = 33.55f,
        icon = Icons.Rounded.AttachMoney
    ),
    Currency(
        name = "CNY",
        buy = 321.52f,
        sell = 323.55f,
        icon = Icons.Rounded.AttachMoney
    ),
    Currency(
        name = "HKD",
        buy = 43.52f,
        sell = 25.55f,
        icon = Icons.Rounded.AttachMoney
    )


)

@Preview
@Composable
fun CurrenciesSection() {
    
}