package com.example.databindingexample

import android.content.Intent
import androidx.databinding.DataBindingUtil
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.databindingexample.binding_with_check_and_radio.ExampleActivity
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

        binding.example5.setOnClickListener{
            startActivity(Intent(this,ExampleActivity::class.java))
        }

    }
}
