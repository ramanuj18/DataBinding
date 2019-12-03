package com.example.databindingexample.binding_with_check_and_radio

import androidx.databinding.DataBindingUtil
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.databindingexample.R
import com.example.databindingexample.databinding.ActivityExampleBinding

class ExampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example)

        var activityExampleBinding:ActivityExampleBinding=DataBindingUtil.setContentView(this,R.layout.activity_example)
        activityExampleBinding.info=InfoModel()
    }
}
