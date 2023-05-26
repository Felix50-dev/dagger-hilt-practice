package com.example.dagger_hilt_practice.di

import com.example.dagger_hilt_practice.data.remote.repository.MyRepositoryImpl
import com.example.dagger_hilt_practice.domain.repository.MyRepository
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    abstract fun bindRepository(myRepositoryImpl: MyRepositoryImpl): MyRepository

}