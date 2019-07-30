package com.example.databindingexample

import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.databindingexample.databinding.ActivityHomeBinding
import com.example.databindingexample.databinding_adapter.UsersActivity
import com.example.databindingexample.login_pkg.LoginActivity
import com.example.databindingexample.view_visibility.VisibilityActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var binding:ActivityHomeBinding=DataBindingUtil.setContentView(this,R.layout.activity_home)
        binding.example1.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
        binding.example2.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
        binding.example3.setOnClickListener {
            startActivity(Intent(this,UsersActivity::class.java))
        }

        binding.example4.setOnClickListener {
            startActivity(Intent(this,VisibilityActivity::class.java))
        }

    }
}
