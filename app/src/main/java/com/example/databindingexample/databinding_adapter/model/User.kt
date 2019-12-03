package com.example.databindingexample.databinding_adapter.model

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.example.databindingexample.BR

/**
 * created by Ramanuj Kesharawani on 29/7/19
 */
class User(_userName:String,_address:String):BaseObservable() {

    @Bindable
    var userName:String=_userName
    set(value) {
        field=value
        notifyPropertyChanged(BR.userName)
     //   notifyChange()
    }

    @Bindable
    var address:String=_address
    set(value) {
        field=value
        notifyPropertyChanged(BR.address)
    }
}