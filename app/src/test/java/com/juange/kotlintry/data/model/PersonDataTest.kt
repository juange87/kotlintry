package com.juange.kotlintry.data.model

import org.junit.Assert
import org.junit.Test

class PersonDataTest{
    val FAKE_PERSON_NAME = "Manolo"
    
    @Test
    fun testMap() {
        val personData = createFakePersonData()
        val person = personData.map()
        Assert.assertEquals(FAKE_PERSON_NAME, person.name)
    }

    private fun createFakePersonData(): PersonData {
        val personData = PersonData()
        personData.name = FAKE_PERSON_NAME
        return personData
    }
}