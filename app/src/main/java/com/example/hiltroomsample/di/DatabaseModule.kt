package com.example.hiltroomsample.di

import android.content.Context
import androidx.room.Room
import com.example.hiltroomsample.data.local.dao.PinDao
import com.example.hiltroomsample.data.local.db.HiltRoomAppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideRoomDatabase(@ApplicationContext applicationContext: Context): HiltRoomAppDatabase {
        return Room.databaseBuilder(
            applicationContext,
            HiltRoomAppDatabase::class.java,
            "HiltRoomApp.db"
        ).build()
    }

    @Provides
    fun providePinDao(appDatabase: HiltRoomAppDatabase): PinDao = appDatabase.getPinDao()
}