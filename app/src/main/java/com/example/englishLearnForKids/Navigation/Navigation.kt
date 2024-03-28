package com.example.englishLearnForKids.Navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.englishLearnForKids.ui.EntryView
import com.example.englishLearnForKids.ui.MainList



@Composable
fun Navigation(){
    val navController= rememberNavController()

    NavHost(navController = navController, startDestination = "MainList"){

        composable(route="EntryView"){
                EntryView()
        }

        composable(route="MainList"){
            MainList()
        }

    }



}