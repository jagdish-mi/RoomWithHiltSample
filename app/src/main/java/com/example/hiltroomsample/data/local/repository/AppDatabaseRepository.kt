package com.example.hiltroomsample.data.local.repository

import com.example.hiltroomsample.data.local.entity.PinEntity

interface AppDatabaseRepository {
    suspend fun getPin(): String

    suspend fun insertPin(pin: PinEntity)
}