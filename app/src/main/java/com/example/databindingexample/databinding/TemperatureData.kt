package com.example.databindingexample.databinding

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.widget.EditText
import com.example.databindingexample.BR

/**
 * created by Ramanuj Kesharawani on 29/7/19
 */
class TemperatureData(_celsius:String,_location:String) :BaseObservable() {

    @Bindable
     var celsius:String=_celsius
      set(value) {
        field=value
          notifyPropertyChanged(BR.celsius)
    }
    @Bindable
     var location:String=_location
    set(value){
        field=value
       notifyPropertyChanged(BR.location)
    }

    @Bindable
    var count:Int=0
    set(value){
        field=value
        notifyPropertyChanged(BR.count)
    }

    fun setTempData(c:EditText,l:EditText){
       // count++
        celsius=c.text.toString()
        location=l.text.toString()
        c.setText("")
        l.setText("")
    }

    fun getUserName():String{
        count++
        return "rama $count"
    }

}