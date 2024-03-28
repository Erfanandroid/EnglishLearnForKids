package com.example.englishLearnForKids.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.graphics.Color
import com.example.englishLearnForKids.Navigation.Navigation
import com.example.englishLearnForKids.ui.theme.EnglishLearnForKidsTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


            setContent {
                EnglishLearnForKidsTheme {
                    Navigation()
                }

            }



    }
}

