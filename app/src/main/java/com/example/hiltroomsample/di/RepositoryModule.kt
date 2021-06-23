package com.example.hiltroomsample.di

import com.example.hiltroomsample.data.local.repository.AppDatabaseRepository
import com.example.hiltroomsample.data.local.repository.AppDatabaseRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun bindAppDatabaseRepository(appDatabaseRepositoryImpl: AppDatabaseRepositoryImpl) : AppDatabaseRepository
}