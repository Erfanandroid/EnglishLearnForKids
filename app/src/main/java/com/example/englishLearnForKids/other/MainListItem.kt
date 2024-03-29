package com.example.englishLearnForKids.other

import java.util.UUID
import javax.annotation.concurrent.Immutable

@Immutable
data class MainListItem(
    val title:String,
    val translation:String,
    val img:Int,
    val id:String=UUID.randomUUID().toString()
)
