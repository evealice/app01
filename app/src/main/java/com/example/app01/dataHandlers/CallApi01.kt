package com.example.app01.dataHandlers

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object CallApi01 {

    private const val BASE_URL = "http://oceanhudx8.ddns.net:9876/"

    val api: ServiceApi01 by lazy {

        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(
                GsonConverterFactory.create()
            )
            .build()
            .create(ServiceApi01::class.java)
    }
}