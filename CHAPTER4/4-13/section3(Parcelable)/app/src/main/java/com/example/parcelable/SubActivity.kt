package com.example.parcelable

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val bundle = intent.getBundleExtra("myBundle")
        var person  = bundle?.getParcelable<Person>("selected_person") as Person

        textView.text = "person.name = ${person.name}, person.age = ${person.age}"

    }
}