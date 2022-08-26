package com.example.signinex.logic

import com.example.signinex.model.AuthCredentials

interface ISignInBL {

    fun checkUserCredentials(credentials: AuthCredentials): Boolean

}