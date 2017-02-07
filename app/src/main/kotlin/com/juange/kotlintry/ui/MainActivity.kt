package com.juange.kotlintry.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.juange.kotlintry.R
import com.juange.kotlintry.domain.GetPeopleByIdUseCase
import com.juange.kotlintry.domain.model.Person

class MainActivity : AppCompatActivity() {

    val getPeopleUseCase: GetPeopleByIdUseCase = GetPeopleByIdUseCase()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        getPeopleUseCase.getPersonById("1", object : GetPeopleByIdUseCase.Callback <Person> {
            override fun onPeople(person: Person) = toastMsg(person.name)
        })
    }

    fun toastMsg(name: String?) {
        Toast.makeText(this, name, Toast.LENGTH_LONG).show()
    }
}
