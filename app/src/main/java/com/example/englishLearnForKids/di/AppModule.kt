package com.example.englishLearnForKids.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

//    @Singleton
//    @Provides
//    fun provideRunningDatabase(
//        @ApplicationContext app: Context
//    ) = Room.databaseBuilder(
//        app,
//        HotelDatabase::class.java,
//        "Hotel_DATABASE"
//    ).build()
//
//    @Singleton
//    @Provides
//    fun provideRunDao(db: HotelDatabase) = db.hotelDao()
//
//    @Singleton
//    @Provides
//    fun provideSharedPreferences(@ApplicationContext app:Context)=
//        app.getSharedPreferences("sharedPref", Context.MODE_PRIVATE)
//
//
//    @Singleton
//    @Provides
//    fun provideFirstTimeToggle(sharedPref: SharedPreferences)=
//        sharedPref.getBoolean("key_first_time_toggle",true)

}