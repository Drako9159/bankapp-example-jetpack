package com.niojar.bankexample

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AttachMoney
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material.icons.rounded.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

    var isVisible by remember {
        mutableStateOf(false)
    }

    var iconState by remember {
        mutableStateOf(Icons.Rounded.KeyboardArrowUp)
    }

    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
            .background(MaterialTheme.colorScheme.inverseOnSurface)
            .animateContentSize()
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .animateContentSize()
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.secondary)
                .clickable {
                    isVisible = !isVisible
                    if (isVisible) {
                        iconState = Icons.Rounded.KeyboardArrowUp
                    } else {
                        iconState = Icons.Rounded.KeyboardArrowDown
                    }
                }) {
                Icon(
                    modifier = Modifier.size(25.dp),
                    imageVector = iconState,
                    contentDescription = "Currencies",
                    tint = MaterialTheme.colorScheme.onSecondary
                )
            }
            Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = "Currencies",
                fontSize = 20.sp,
                color = MaterialTheme.colorScheme.onSecondaryContainer,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(
            modifier = Modifier
                .height(1.dp)
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.secondaryContainer)
        )
        if (isVisible) {
            BoxWithConstraints(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp)
                    .clip(RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp))
                    .background(MaterialTheme.colorScheme.background)
            ) {
                val boxWithConstraintsScope = this
                val width = boxWithConstraintsScope.maxWidth / 3

                Column(modifier = Modifier.fillMaxWidth()) {
                    Spacer(modifier = Modifier.height(16.dp))
                    Row(modifier = Modifier.fillMaxWidth()) {
                        Text(text = "Currency")
                    }
                }
            }
        }
    }
}