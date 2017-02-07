package com.juange.kotlintry.data.model

import com.juange.kotlintry.domain.model.Person

class PersonData {
    var name: String? = null
}

fun PersonData.map(): Person {
    val person: Person = Person()
    person.name = this.name
    return person
}