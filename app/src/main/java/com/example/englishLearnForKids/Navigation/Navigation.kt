package com.example.englishLearnForKids.Navigation

import android.content.Context
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.englishLearnForKids.ui.Alphabet
import com.example.englishLearnForKids.ui.ColumnWithButton
import com.example.englishLearnForKids.ui.EntryView
import com.example.englishLearnForKids.ui.MainList
import kotlinx.coroutines.withContext



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Navigation(context: Context){
    val navController= rememberNavController()

    NavHost(navController = navController, startDestination = "Alphabet"){

        composable(route="EntryView"){
                EntryView()
        }

        composable(route="MainList"){
            MainList(navController)
        }

        composable(route = "Alphabet"){
            Alphabet(context)
        }

        composable(route = "test"){
            ColumnWithButton()
        }

    }



}