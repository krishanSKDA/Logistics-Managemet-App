package com.example.logistics_mobile_app.screens


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.example.logistics_mobile_app.R
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.lazy.LazyColumn



@Composable
fun ServiceScreen(innerPadding: PaddingValues) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        item {
            Text(
                text = "Our services",
                fontSize = 24.sp,
                modifier = Modifier.padding(16.dp)
            )
        }

        item {
            ServiceItem(
                text = "Calculate the price",
                iconResId = R.drawable.calculator
            )
        }
        item {
            ServiceItem(
                text = "Technical support",
                iconResId = R.drawable.technical_support
            )
        }
        item {
            ServiceItem(
                text = "Call a courier",
                iconResId = R.drawable.call
            )
        }
        item {
            ServiceItem(
                text = "Delivery time",
                iconResId = R.drawable.delivery_time
            )
        }
        item {
            ServiceItem(
                text = "Real time tracking delivery",
                iconResId = R.drawable.real_time
            )
        }
        item {
            ServiceItem(
                text = "Repair the Vehicle",
                iconResId = R.drawable.service
            )
        }
        item {
            ServiceItem(
                text = "Fast Delivery Service ",
                iconResId = R.drawable.fast_delivery
            )
        }
        item {
            ServiceItem(
                text = "Tracking ID",
                iconResId = R.drawable.tracking_id
            )
        }
        item {
            ServiceItem(
                text = "Premium Services",
                iconResId = R.drawable.premium_service
            )
        }
    }
}

@Composable
fun ServiceItem(text: String, iconResId: Int) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 14.dp),
            shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(
                containerColor = Color(0xFFB3E5FC) )
    ){
        Row(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
            painter = painterResource(id = iconResId),
            contentDescription = text,
            modifier = Modifier.size(40.dp)
        )

            Spacer(modifier = Modifier.width(16.dp))
            Text(text = text, fontSize = 18.sp)
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Service() {
    ServiceScreen(innerPadding = PaddingValues())
}