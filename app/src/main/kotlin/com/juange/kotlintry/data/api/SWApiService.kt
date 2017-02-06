package com.juange.kotlintry.data.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface SWApiService {
    @GET("people/{id}/")
    fun getPeopeById(@Path("id") id: String): Call<People>
}