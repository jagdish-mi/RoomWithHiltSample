package com.example.hiltroomsample.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.hiltroomsample.data.local.dao.PinDao
import com.example.hiltroomsample.data.local.entity.PinEntity

@Database(entities = [PinEntity::class], version = 1, exportSchema = false)
abstract class HiltRoomAppDatabase : RoomDatabase(){

    abstract fun getPinDao(): PinDao
}