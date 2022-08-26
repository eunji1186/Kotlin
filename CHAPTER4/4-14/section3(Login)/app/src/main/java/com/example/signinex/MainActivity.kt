package com.example.signinex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.signinex.logic.ISignInBL
import com.example.signinex.logic.SignInBL
import com.example.signinex.model.AuthCredentials
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(intentFor<SignInActivity>())
        finish()
    }
}