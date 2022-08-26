package com.example.parcelable

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    var isFragmentLoaded = true
    val person = Person("Kildong", 5)
    val child = ChildData("Joosol", 15)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showFragmentOne()

        btn_change.setOnClickListener {
            if(isFragmentLoaded) showFragmentTwo() else showFragmentOne()
        }

        btn_sub.setOnClickListener {
            val intent = Intent(this, SubActivity::class.java)

            var bundle = Bundle()
            bundle.putParcelable("selected_person", person)
            intent.putExtra("myBundle", bundle)

            startActivity(intent)
        }
    }



    fun showFragmentOne() {
        val fragment = FragmentOne.newInstance("newInstance", 21, child)

        replaceFragment(fragment, R.id.fragment_holder, "one")
        isFragmentLoaded = true

    }

    fun showFragmentTwo() {
        val fragment = FragmentTwo()

        replaceFragment(fragment, R.id.fragment_holder, "two")
        isFragmentLoaded = false
    }
}

inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> FragmentTransaction) {
    beginTransaction().func().commit() // func()는 람다식 매개변수로 받아서 처리
}

fun AppCompatActivity.addFragment(fragment: Fragment, frameId: Int, tag: String){
    supportFragmentManager.inTransaction { add(frameId, fragment, tag) }
}

fun AppCompatActivity.replaceFragment(fragment: Fragment, frameId: Int, tag: String) {
    supportFragmentManager.inTransaction{replace(frameId, fragment, tag)}
}