package com.example.databindingexample.login_pkg.model

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.databinding.ObservableField
import android.view.View
import android.widget.Toast
import com.example.databindingexample.BR


/**
 * created by Ramanuj Kesharawani on 29/7/19
 */
class LoginModel(private val loginView: LoginView) : BaseObservable() {

    @Bindable
    var userName: String? = null
        set(value) {
            field = value
            notifyPropertyChanged(BR.userName)
        }

    @Bindable
    var userPassword: String? = null
        set(value) {
            field = value
            notifyPropertyChanged(BR.userPassword)
        }

    @Bindable
    var userNameError: String? = null
        set(value) {
            field = value
            notifyPropertyChanged(BR.userNameError)
        }

    @Bindable
    var passwordError: String? = null
        set(value) {
            field = value
            notifyPropertyChanged(BR.passwordError)
        }

    fun login(view: View,loginModel: LoginModel) {
        if (loginModel.userName == null || loginModel.userName!!.isEmpty()) {
            userNameError = "please enter user name"
            passwordError=null
            return
        }
        if (loginModel.userPassword == null || loginModel.userPassword!!.isEmpty()) {
            passwordError = "please enter password"
            userNameError = null
            return
        }

        loginView.loginSuccess()
        Toast.makeText(view.context,"login success",Toast.LENGTH_SHORT).show()
        userNameError=null
        passwordError=null

    }

}