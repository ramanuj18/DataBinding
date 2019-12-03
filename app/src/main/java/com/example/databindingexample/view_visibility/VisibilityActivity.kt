package com.example.databindingexample.view_visibility

import androidx.databinding.DataBindingUtil
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.databindingexample.R
import com.example.databindingexample.databinding.ActivityVisibilityBinding

class VisibilityActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding:ActivityVisibilityBinding=DataBindingUtil.setContentView(this,R.layout.activity_visibility)
        binding.visibility=VisibilityModel()
    }
}
