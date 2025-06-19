package com.example.composetutorial.ui.bottom_navigation

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetutorial.R
import com.example.composetutorial.ui.theme.ComposeTutorialTheme

@Composable
fun FavouritesScreen() {
    ComposeTutorialTheme {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    top = WindowInsets.statusBars.asPaddingValues()
                        .calculateTopPadding()
                )
        ) {
            Column(modifier = Modifier.padding(start = 10.dp, end = 10.dp)) {
                //Information
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
                Box {
                    Row(modifier = Modifier.padding(start = 20.dp, end = 20.dp)) {
                        Image(
                            painter = painterResource(R.drawable.ic_launcher_background),
                            contentDescription = null,
                            modifier = Modifier
                                .clip(shape = RoundedCornerShape(10.dp))
                                .size(80.dp)
                        )
                        Column(modifier = Modifier.padding(start = 10.dp, bottom = 10.dp)) {
                            Text(text = "Sardar Jahan", fontSize = 20.sp)
                            Text(
                                text = "sardarmusic@gmail.com",
                                color = Color.Gray,
                                modifier = Modifier.padding(bottom = 10.dp)
                            )
                            Text(
                                text = "Gold Member", color = Color.Gray,
                                modifier = Modifier.padding(bottom = 10.dp)
                            )
                            Text(
                                text = "Love Music and I am not an Musician.", color = Color.Gray,
                                modifier = Modifier.padding(bottom = 10.dp)
                            )
                        }
                    }
                }

                // Favorite Albums
                Text(text = "Favorite Album", fontSize = 20.sp)
                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    items(SampleData.conversationSample.take(3)) { drawable ->
                        Image(
                            painter = painterResource(drawable),
                            contentDescription = "Album cover",
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(10.dp))
                        )
                    }
                }

                // Favorite Tracks
                Text(text = "Favorite Music", fontSize = 20.sp)
                LazyVerticalGrid(
                    columns = GridCells.Fixed(3),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(SampleData.conversationSample) { drawable ->
                        Image(
                            painter = painterResource(drawable),
                            contentDescription = "Track cover",
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(10.dp))
                        )
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
fun PreviewFavoriteScreen() {
    FavouritesScreen()
}

object SampleData {
    val conversationSample = listOf(
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background
    )
}