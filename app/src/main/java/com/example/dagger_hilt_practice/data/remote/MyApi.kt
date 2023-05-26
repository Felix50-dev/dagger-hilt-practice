package com.example.dagger_hilt_practice.data.remote

import retrofit2.http.GET

interface MyApi {

    @GET("test")
    fun doNetworkCall() {

    }
}