package com.example.composetutorial.ui.onboard

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetutorial.R
import com.example.composetutorial.ui.theme.ComposeTutorialTheme
import com.example.composetutorial.ui.theme.Purple40
import com.example.composetutorial.ui.theme.OnboardingColor

@Composable
fun OnboardingScreen() {
    ComposeTutorialTheme {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    top = WindowInsets.statusBars.asPaddingValues()
                        .calculateTopPadding() + 10.dp
                )
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(OnboardingColor)
            ) {
                Image(
                    painter = painterResource(R.drawable.rectangle_onboard_main),
                    contentDescription = null,
                    alignment = Alignment.TopCenter,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(LocalConfiguration.current.screenHeightDp.dp / 3 * 2)

                )
                Image(
                    painter = painterResource(R.drawable.rectangle_onboard_background),
                    contentDescription = null,
                    alignment = Alignment.TopCenter,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(LocalConfiguration.current.screenHeightDp.dp / 3 * 2)
                )
                Column() {
                    Box(modifier = Modifier.weight(1f))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(0.8f)
                            .align(Alignment.CenterHorizontally)
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Image(
                                painter = painterResource(R.drawable.logo),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(bottom = 30.dp)
                                    .size(40.dp)
                            )
                            Text(
                                text = "Millions Of Songs.\n Free on Tunify",
                                fontSize = 28.sp,
                                textAlign = TextAlign.Center
                            )
                            Spacer(modifier = Modifier.size(20.dp))
                            Text(
                                text = "I can chase you and I can catch you, but there\n is nothing I can do to mae you mine.",
                                fontSize = 13.sp,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.fillMaxWidth()) {

                            Box(
                                contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 20.dp)
                                    .height(50.dp)
                                    .clip(CircleShape)
                                    .background(Purple40)
                            ) {
                                Text(
                                    text = "Sign up free",
                                    textAlign = TextAlign.Center,

                                    )
                            }

                            Spacer(modifier = Modifier.size(35.dp))

                            Box(modifier = Modifier.fillMaxWidth()) {
                                Icon(
                                    painter = painterResource(R.drawable.ic_google),
                                    contentDescription = "ArrowBack",
                                    modifier = Modifier
                                        .padding(start = 35.dp)
                                        .size(24.dp)
                                )
                                Text(
                                    "Continue with Google",
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier.align(
                                        Alignment.Center
                                    )
                                )
                            }

                            Spacer(modifier = Modifier.size(35.dp))

                            Box(modifier = Modifier.fillMaxWidth()) {
                                Icon(
                                    painter = painterResource(R.drawable.ic_apple),
                                    contentDescription = "ArrowBack",
                                    modifier = Modifier
                                        .padding(start = 35.dp)
                                        .size(24.dp)
                                )
                                Text(
                                    "Continue with Apple",
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier.align(
                                        Alignment.Center
                                    )
                                )
                            }

                            Spacer(modifier = Modifier.size(50.dp))

                            Box(
                                contentAlignment = Alignment.Center,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(
                                    "Log in",
                                    textAlign = TextAlign.Center,

                                    )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(name = "Light Mode")
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Dark Mode",
)
@Composable
fun PreviewOnboardingScreen() {
    OnboardingScreen()
}