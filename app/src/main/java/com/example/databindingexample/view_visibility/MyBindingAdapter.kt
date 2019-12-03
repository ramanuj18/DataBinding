package com.example.databindingexample.view_visibility

import androidx.databinding.BindingAdapter
import androidx.databinding.InverseBindingAdapter
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
        textView.text=amount.toString()
    }

    @BindingAdapter("setResource")
    @JvmStatic
    fun setImageUrl(imageView: ImageView, url:String){
        imageView.setImageResource(R.drawable.download)
    }

}