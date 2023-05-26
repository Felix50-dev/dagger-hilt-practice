package com.example.dagger_hilt_practice.data.remote.repository

import android.app.Application
import com.example.dagger_hilt_practice.R
import com.example.dagger_hilt_practice.data.remote.MyApi
import com.example.dagger_hilt_practice.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val myApi: MyApi,
    private val appContext: Application
    ) : MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("Hello from the repository. The app name is $appName")
    }

    override suspend fun doNetworkCall() {

    }
}