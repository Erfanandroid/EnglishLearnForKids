package com.example.englishLearnForKids.other

import android.content.Context
import android.media.MediaPlayer
import javax.annotation.concurrent.Immutable

@Immutable
data class AlphabetItem(
    val capitalLetter:String,
    val smallLetter:String,
    val img:Int,
    val imgDescription:String,
    val sound:Int
)
