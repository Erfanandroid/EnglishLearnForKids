package com.example.englishLearnForKids.Navigation

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.englishLearnForKids.ui.AlphabetLearn
import com.example.englishLearnForKids.ui.EntryView
import com.example.englishLearnForKids.ui.MainList


@Composable
fun Navigation(context: Context){
    val navController= rememberNavController()

    NavHost(navController = navController, startDestination = "MainList"){

        composable(route="EntryView"){
                EntryView()
        }

        composable(route="MainList"){
            MainList(navController)
        }

        composable(route = "Alphabet"){
            AlphabetLearn(context)
        }

//        composable(route = "test"){
//            ConstraintLayoutContent()
//        }

    }



}