package com.example.hiltroomsample.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PinEntity(
    @PrimaryKey val pin: String
)
