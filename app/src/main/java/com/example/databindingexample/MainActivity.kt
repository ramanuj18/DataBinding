package com.example.databindingexample

import androidx.databinding.DataBindingUtil
import androidx.appcompat.app.AppCompatActivity
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
