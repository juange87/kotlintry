package com.juange.kotlintry.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.juange.kotlintry.R
import com.juange.kotlintry.data.api.People
import com.juange.kotlintry.domain.GetPeopeByIdUseCase

class MainActivity : AppCompatActivity() {

    val getPeopleUseCase: GetPeopeByIdUseCase = GetPeopeByIdUseCase()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        getPeopleUseCase.getPersonById("1", object : GetPeopeByIdUseCase.Callback <People> {
            override fun onPeople(people: People) = toastMSg(people.name)
        })
    }

    fun toastMSg(name: String?) {
        Toast.makeText(this, name, Toast.LENGTH_LONG).show()
    }
}
