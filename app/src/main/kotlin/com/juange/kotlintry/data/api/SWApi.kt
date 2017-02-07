package com.juange.kotlintry.data.api

import com.juange.kotlintry.BuildConfig
import com.juange.kotlintry.data.api.model.PersonApiModel
import com.juange.kotlintry.data.api.model.map
import com.juange.kotlintry.data.model.PersonData
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

    fun getPersonById(personId: String): PersonData {
        val call: Call<PersonApiModel> = swapi.getPersonById(personId)
        val response: Response<PersonApiModel> = call.execute()
        val personApiModel: PersonApiModel = response.body()
        return personApiModel.map()
    }
}