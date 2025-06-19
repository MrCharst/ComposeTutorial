package com.example.composetutorial.ui.onboard

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetutorial.R
import com.example.composetutorial.ui.theme.ComposeTutorialTheme
import com.example.composetutorial.ui.theme.OnboardingColor
import com.example.composetutorial.ui.theme.Purple40
import com.example.composetutorial.ui.theme.Purple80

@Composable
fun SignUpScreen() {
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
                    painter = painterResource(R.drawable.rectangle_signup),
                    contentDescription = null,
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.TopCenter)
                )
                Image(
                    painter = painterResource(R.drawable.rectangle_login_button),
                    contentDescription = null,
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.BottomCenter)
                )
                Column(modifier = Modifier.padding(start = 10.dp, end = 10.dp)) {
                    Box(modifier = Modifier.weight(1f)) {
                        Box() {
                            IconButton(
                                onClick = { },
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Row(modifier = Modifier.fillMaxWidth()) {
                                    Icon(
                                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                        contentDescription = "ArrowBack",
                                    )
                                }
                            }
                        }

                        Column(
                            modifier = Modifier
                                .align(Alignment.BottomCenter)
                                .padding(bottom = 70.dp)
                        ) {
                            Text(
                                "Sign up",
                                textAlign = TextAlign.Center,
                                fontSize = 28.sp,
                                modifier = Modifier.padding(bottom = 5.dp)
                            )
                            Text(
                                "Welcome back to Tunify, which will make accompany your mood for music. Let's create account now",
                            )
                        }

                    }

                    Box(modifier = Modifier.weight(1f)) {
                        var email by remember { mutableStateOf("") }
                        var password by remember { mutableStateOf("") }
                        var passwordVisible by remember { mutableStateOf(false) }

                        Column(modifier = Modifier.padding(16.dp)) {
                            OutlinedTextField(
                                value = email,
                                onValueChange = { email = it },
                                label = { Text("Full name") },
                                modifier = Modifier.fillMaxWidth()
                            )

                            Spacer(modifier = Modifier.height(8.dp))

                            OutlinedTextField(
                                value = email,
                                onValueChange = { email = it },
                                label = { Text("Email address") },
                                modifier = Modifier.fillMaxWidth()
                            )

                            Spacer(modifier = Modifier.height(8.dp))

                            OutlinedTextField(
                                value = password,
                                onValueChange = { password = it },
                                label = { Text("Password") },
                                modifier = Modifier.fillMaxWidth(),
                                visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                                trailingIcon = {
                                    val icon =
                                        if (passwordVisible) R.drawable.icon_visibility_24 else R.drawable.icon_visibility_off_24
                                    IconButton(onClick = { passwordVisible = !passwordVisible }) {
                                        Icon(
                                            painter = painterResource(icon),
                                            contentDescription = "Toggle password visibility",
                                            modifier = Modifier.size(20.dp)
                                        )
                                    }
                                }
                            )
                        }

                        Column(
                            modifier = Modifier
                                .align(Alignment.BottomCenter).padding(bottom = 70.dp)
                        ) {
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
                                    text = "Create account",
                                    textAlign = TextAlign.Center,
                                )
                            }
                            Row(horizontalArrangement = Arrangement.Center,
                                modifier = Modifier.fillMaxWidth().padding(top = 10.dp)
                            ) {
                                Text(
                                    text = "You have account?",
                                    textAlign = TextAlign.Center,
                                    fontSize = 12.sp,
                                )
                                Text(
                                    text = " Sign in",
                                    textAlign = TextAlign.Center,
                                    color = Purple80,
                                    fontSize = 12.sp,
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
fun PreviewSignUpScreen() {
    SignUpScreen()
}