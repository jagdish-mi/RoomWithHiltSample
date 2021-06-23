package com.example.hiltroomsample.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.hiltroomsample.data.local.entity.PinEntity

@Dao
interface PinDao {

    @Query("SELECT PIN FROM PinEntity")
    suspend fun getPin(): String

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPin(pin: PinEntity)
}