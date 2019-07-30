package com.example.databindingexample

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.databindingexample.databinding.ActivityBindViewBinding

class BindViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bind_view)

        var binding:ActivityBindViewBinding=DataBindingUtil.setContentView(this,R.layout.activity_bind_view)
        binding.txtName.text="Ramanuj"
    }
}
