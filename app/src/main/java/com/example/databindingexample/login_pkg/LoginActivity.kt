package com.example.databindingexample.login_pkg

import android.content.Intent
import androidx.databinding.DataBindingUtil
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.databindingexample.R
import com.example.databindingexample.databinding.ActivityLoginBinding
import com.example.databindingexample.login_pkg.model.LoginModel
import com.example.databindingexample.login_pkg.model.LoginView

class LoginActivity : AppCompatActivity(),LoginView{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding:ActivityLoginBinding=DataBindingUtil.setContentView(this,R.layout.activity_login)
        var loginmodel= LoginModel(this)

        binding.loginmodel=loginmodel

      //  loginmodel.userName="rama"
//        binding.loginmodel?.run {
//            userName="rama"
//        }
    }

    override fun loginSuccess(loginModel: LoginModel) {
        Toast.makeText(this,"login success, User age is "+loginModel.userAge,Toast.LENGTH_SHORT).show()
        startActivity(Intent(this,DetailActivity::class.java))
    }
}
