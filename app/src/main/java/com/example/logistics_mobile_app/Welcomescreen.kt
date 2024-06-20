package com.example.logisticsapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.logistics_mobile_app.MainActivity
import com.example.logisticsapp.components.CButton
import com.example.logisticsapp.components.DontHaveAccountRow
import com.example.logistics_mobile_app.R

@Composable
fun WelcomeScreen(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    context: MainActivity
) {

    Box(
        modifier = modifier.fillMaxSize()
    ) {
        // Background Image
        Image(
            painter = painterResource(id = R.drawable.welcome),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        /// Content
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp)
        ) {

            Spacer(modifier = Modifier.height(32.dp))

            Image(
                painter = painterResource(id = R.drawable.app_icon),
                contentDescription = null,
                modifier = Modifier
                    .width(200.dp)
                    .height(100.dp),
                contentScale = ContentScale.Fit
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                "WELCOME",
                fontSize = 32.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight(500),
                color = Color.White,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top =140.dp)
            )

            Text(
                "Elevating The Future \nOf Logistics.",
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.SansSerif,
                fontSize = 20.sp,
                fontWeight = FontWeight(600),
                color = Color.White,
                modifier = Modifier.padding(top = 60.dp)
            )

            Spacer(modifier = Modifier.weight(1f))

            CButton(text = "Sign In With Email",
                onClick = {
                    navController.navigate("login")
                }
            )

            DontHaveAccountRow(
                onSignupTap = {
                    navController.navigate("signup")
                }
            )
        }
    }
}
//
//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun welcome() {
//WelcomeScreen()
//}