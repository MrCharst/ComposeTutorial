package com.example.composetutorial.ui.bottom_navigation

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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetutorial.R
import com.example.composetutorial.ui.theme.ComposeTutorialTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlayMusicScreen() {
    ComposeTutorialTheme {
        Surface {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        top = WindowInsets.statusBars.asPaddingValues()
                            .calculateTopPadding() + 10.dp
                    )
            ) {
                Column {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        IconButton(
                            onClick = { },
                        ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "ArrowBack",
                            )
                        }
                        Text(
                            text = "Ophelia by Steven", fontSize = 20.sp
                        )
                        IconButton(
                            onClick = { },
                        ) {
                            Icon(
                                imageVector = Icons.Default.Favorite,
                                contentDescription = "ArrowBack",
                            )
                        }
                    }

                    Spacer(modifier = Modifier.size(20.dp))

                    Image(
                        painter = painterResource(R.drawable.ic_launcher_background),
                        contentDescription = null,
                        modifier = Modifier
                            .clip(shape = RoundedCornerShape(20.dp))
                            .size(300.dp)
                            .align(Alignment.CenterHorizontally)
                    )

                    Text(
                        text = "Ophelia",
                        modifier = Modifier
                            .padding(top = 20.dp, bottom = 10.dp)
                            .align(Alignment.CenterHorizontally),
                        fontSize = 20.sp
                    )

                    Text(
                        text = "Steven Price",
                        modifier = Modifier.align(Alignment.CenterHorizontally)
                    )

                    var currentPosition by remember { mutableFloatStateOf(0f) }

                    Slider(
                        value = currentPosition,
                        onValueChange = { newValue ->
                            currentPosition = newValue
                        },
                        valueRange = 0f..100f,
                        steps = 0,
                        modifier = Modifier.fillMaxWidth().padding(top = 20.dp),
                        thumb = {}
                    )

                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(text = "0.00")
                        Text(text = "0.00")
                    }

                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        IconButton(
                            onClick = { },
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.icon_shuffle_24),
                                contentDescription = "ArrowBack",
                                modifier = Modifier.size(30.dp)
                            )
                        }
                        IconButton(
                            onClick = { },
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.icon_skip_previous_24),
                                contentDescription = "ArrowBack",
                                modifier = Modifier.size(30.dp)
                            )
                        }
                        Box(
                            modifier = Modifier
                                .background(shape = CircleShape, color = Color.Cyan).size(70.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            IconButton(
                                onClick = { },
                            ) {
                                Icon(
                                    painter = painterResource(R.drawable.icon_pause_24),
                                    contentDescription = "ArrowBack",
                                    modifier = Modifier.size(50.dp)
                                )
                            }
                        }
                        IconButton(
                            onClick = { },
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.icon_skip_next_24),
                                contentDescription = "ArrowBack",
                                modifier = Modifier.size(30.dp)
                            )
                        }
                        IconButton(
                            onClick = { },
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.icon_repeat_24),
                                contentDescription = "ArrowBack",
                                modifier = Modifier.size(30.dp)
                            )
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
fun PreviewPlayMusicScreen() {
    PlayMusicScreen()
}
