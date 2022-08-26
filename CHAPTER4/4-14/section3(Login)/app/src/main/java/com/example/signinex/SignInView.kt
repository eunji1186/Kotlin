package com.example.signinex

import org.jetbrains.anko.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class SignInView : AnkoComponent<SignInActivity> {

    private lateinit var ankoContext: AnkoContext<SignInActivity>

    override fun createView(ui: AnkoContext<SignInActivity>) = with(ui) {

        ankoContext = ui

        verticalLayout {
            padding = dip(20)
            lparams(width  = matchParent, height = matchParent)

            val username=editText{
                id=R.id.edit_username
                hintResource=R.string.sign_in_username
                //textSize=24f
            }.lparams(width= matchParent, height= wrapContent)

            val password=editText{
                id=R.id.edit_password
                hintResource=R.string.sign_in_password
                //textSize=24f
            }.lparams(width= matchParent, height= wrapContent)

            button{
                id=R.id.btn_sign_in
                textResource=R.string.sign_in_button

                onClick {
                    handleOnSignInButtonPressed(
                        ui=ui,
                        username=username.text.toString(),
                        password=password.text.toString()
                    )
                }
            }.lparams(width= matchParent, height= wrapContent)
        }
    }

    fun showAccessDeniedAlertDialog() {
        with(ankoContext) {
            alert(title=R.string.invalid_user_title,
                message=R.string.invalid_user_message){
                positiveButton(R.string.button_close){ }
            }.show()
        }
    }

}

private fun handleOnSignInButtonPressed(ui: AnkoContext<SignInActivity>, username: String, password: String) {
    if (username.isBlank() or password.isBlank()) {
        with(ui) {
            alert(title=R.string.access_denied_title,
                message = R.string.access_denied_msg){
                positiveButton(R.string.button_close){ }
            }.show()
        }
    } else {
        // TODO
        ui.owner.authorizeUser(username, password)
    }
}