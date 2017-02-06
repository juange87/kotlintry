package com.juange.kotlintry.data.api

import com.juange.kotlintry.BuildConfig
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class SWApi {
    private val swapi: SWApiService

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl(BuildConfig.API)
                .addConverterFactory(MoshiConverterFactory.create())
                .build()

        swapi = retrofit.create(SWApiService::class.java)
    }

    fun getPeopleById(personId: String): People {
        val call: Call<People> = swapi.getPeopeById(personId)
        val response: Response<People> = call.execute()
        return response.body()
    }
}