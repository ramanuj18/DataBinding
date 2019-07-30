package com.example.databindingexample.view_visibility

import android.databinding.BindingAdapter
import android.databinding.InverseBindingAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.databindingexample.R

/**
 * created by Ramanuj Kesharawani on 30/7/19
 */
object MyBindingAdapter {
    @BindingAdapter("value")
    @JvmStatic
    fun bindingValue(textView: TextView,amount:Int){
        textView.text=""+amount
    }

    @BindingAdapter("setResource")
    @JvmStatic
    fun setImageUrl(imageView: ImageView, url:String){
        imageView.setImageResource(R.drawable.download)
    }

}