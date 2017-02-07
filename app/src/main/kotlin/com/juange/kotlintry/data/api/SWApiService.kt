package com.juange.kotlintry.data.api

import com.juange.kotlintry.data.api.model.PersonApiModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface SWApiService {
    @GET("people/{id}/")
    fun getPersonById(@Path("id") id: String): Call<PersonApiModel>
}