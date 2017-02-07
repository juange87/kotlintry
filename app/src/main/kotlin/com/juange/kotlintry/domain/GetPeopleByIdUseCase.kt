package com.juange.kotlintry.domain

import com.juange.kotlintry.data.SWRepository
import com.juange.kotlintry.domain.model.Person
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class GetPeopleByIdUseCase {
    val repository: SWRepository = SWRepository()

    fun getPersonById(personId: String, callback: Callback<Person>) {
        doAsync {
            val person: Person = repository.getPersonById(personId)
            uiThread {
                callback.onSuccess(person)
            }
        }
    }

    interface Callback<T> {
        fun onSuccess(result: T)
    }
}