package com.example.dagger_hilt_practice.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}