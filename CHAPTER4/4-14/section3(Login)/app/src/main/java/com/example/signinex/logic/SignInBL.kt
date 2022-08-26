package com.example.signinex.logic

import com.example.signinex.model.AuthCredentials

class SignInBL : ISignInBL {

    override fun checkUserCredentials(credentials: AuthCredentials): Boolean {
        return ("aaaa".equals(credentials.username) && "bbbb".equals(credentials.password))
    }
}