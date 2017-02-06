package com.juange.kotlintry.domain

import com.juange.kotlintry.data.SWRepository
import com.juange.kotlintry.data.api.People
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class GetPeopeByIdUseCase {
    val repository: SWRepository = SWRepository()

    fun getPersonById(personId: String, callback: Callback<People>) {
        doAsync {
            val people: People = repository.getPersonById(personId)
            uiThread {
                callback.onPeople(people)
            }
        }
    }

    public interface Callback<People> {
        public fun onPeople(people: People)
    }
}