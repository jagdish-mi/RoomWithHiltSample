package com.example.hiltroomsample.data.local.repository

import com.example.hiltroomsample.data.local.dao.PinDao
import com.example.hiltroomsample.data.local.entity.PinEntity
import com.example.hiltroomsample.model.PinModel
import javax.inject.Inject

class AppDatabaseRepositoryImpl @Inject constructor(private val pinDao: PinDao) :
    AppDatabaseRepository {

    override suspend fun getPin(): String {
        return pinDao.getPin()
    }

    override suspend fun insertPin(pin: PinEntity) {
        pinDao.insertPin(pin)
    }
}