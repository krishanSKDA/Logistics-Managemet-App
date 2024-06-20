import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import androidx.compose.material3.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.logistics_mobile_app.R
import com.example.logistics_mobile_app.navigation.Graph
import kotlinx.coroutines.launch

@Composable
fun OnboardingScreen(navController: NavController) {
    val pagerState = rememberPagerState()
    val coroutineScope = rememberCoroutineScope()

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        HorizontalPager(
            count = 3,
            state = pagerState,
            modifier = Modifier.weight(1f)
        ) { page ->
            when (page) {
                0 -> OnboardingPage(
                    imageRes = R.drawable.track_onboard_01,
                    title = "Track Packages",
                    description = "Easily track your packages in real-time and get updates on their status.",
                    backgroundColor = Color(0xFF4B6268)
                )
                1 -> OnboardingPage(
                    imageRes = R.drawable.delivery_onboarding_02,
                    title = "Delivery Options",
                    description = "Choose from a variety of delivery options to suit your needs.",
                    backgroundColor = Color(0xFF4B6268)
                )
                2 -> OnboardingPage(
                    imageRes = R.drawable.customer_onboarding_03,
                    title = "Customer Support",
                    description = "Access 24/7 customer support to resolve any issues quickly and efficiently.",
                    backgroundColor = Color(0xFF4B6268)
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextButton(onClick = { navController.navigate(Graph.WELCOME ) }) {
                Text(text = "SKIP")
            }
            Button(
                onClick = {
                    if (pagerState.currentPage == 2) {
                        navController.navigate("welcome") {
                            popUpTo("onboarding") { inclusive = true }
                        }
                    } else {
                        coroutineScope.launch {
                            pagerState.animateScrollToPage(pagerState.currentPage + 1)
                        }
                    }
                }
            ) {
                Text(text = if (pagerState.currentPage == 2) "STARTED" else "NEXT")
            }
        }
    }
}

@Composable
fun OnboardingPage(
    imageRes: Int,
    title: String,
    description: String,
    backgroundColor: Color = Color(0xFF4B6268)
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = null,
            modifier = Modifier
                .height(350.dp)
                .fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = title,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = description,
            fontSize = 16.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewOnboardingScreen() {
    OnboardingScreen(rememberNavController())
}
