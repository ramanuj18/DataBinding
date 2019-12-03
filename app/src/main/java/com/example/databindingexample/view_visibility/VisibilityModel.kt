package com.example.databindingexample.view_visibility

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.BindingAdapter
import android.widget.ImageView
import com.example.databindingexample.BR
import com.example.databindingexample.R

/**
 * created by Ramanuj Kesharawani on 30/7/19
 */
class VisibilityModel :BaseObservable() {

    @Bindable
    var visibilityFlag:Boolean=false
    set(value){
        field=value
        notifyPropertyChanged(BR.visibilityFlag)
    }
    @Bindable
    var value:Int=10
        set(value){
            field=value
            notifyPropertyChanged(BR.value)
        }

    @Bindable
    var url:String="hello world"
        set(value){
            field=value
            notifyPropertyChanged(BR.url)
        }

    fun updateVisibility(){
        visibilityFlag = !visibilityFlag
    }

}