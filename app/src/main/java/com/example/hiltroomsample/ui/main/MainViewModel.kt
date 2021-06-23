package com.example.hiltroomsample.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.example.hiltroomsample.data.local.entity.PinEntity
import com.example.hiltroomsample.data.local.repository.AppDatabaseRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val appDatabaseRepository: AppDatabaseRepository) : ViewModel() {

    fun insertPin(pin: PinEntity){
        viewModelScope.launch {
            appDatabaseRepository.insertPin(pin)
        }
    }

    val livePinData = liveData(Dispatchers.IO) {
        emit(appDatabaseRepository.getPin())
    }

}