package com.juange.kotlintry.data.api.model

import com.juange.kotlintry.data.model.PersonData

class PersonApiModel {
    val name: String? = null
}

fun PersonApiModel.map(): PersonData {
    val personData: PersonData = PersonData()
    personData.name = this.name
    return personData
}