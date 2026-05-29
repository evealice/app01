package com.example.app01.dataHandlers

import retrofit2.http.GET

interface ServiceApi01 {

    @GET("v1/situation")
    suspend fun getSituation(): DataApi01
}