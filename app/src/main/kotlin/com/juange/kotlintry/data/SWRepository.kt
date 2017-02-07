package com.juange.kotlintry.data

import com.juange.kotlintry.data.api.SWApi
import com.juange.kotlintry.data.model.PersonData
import com.juange.kotlintry.data.model.map
import com.juange.kotlintry.domain.model.Person

class SWRepository {
    val api: SWApi = SWApi()

    fun getPersonById(personId: String): Person {
        val person: PersonData = api.getPersonById(personId)
        return person.map()
    }
}