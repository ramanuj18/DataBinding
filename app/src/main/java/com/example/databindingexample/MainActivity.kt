package com.example.databindingexample

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.databindingexample.databinding.ActivityMainBinding
import com.example.databindingexample.databinding.TemperatureData

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding:ActivityMainBinding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        var temperatureData=TemperatureData("28.5","vijay nagar indore")
        binding.temp=temperatureData

    }
}
