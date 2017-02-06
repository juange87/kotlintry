package com.juange.kotlintry.data

import com.juange.kotlintry.data.api.People
import com.juange.kotlintry.data.api.SWApi

class SWRepository {
    val api: SWApi = SWApi()

    fun getPersonById(personId: String): People {
        return api.getPeopleById(personId)
    }
}