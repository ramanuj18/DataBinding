package com.example.databindingexample.binding_with_check_and_radio

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import android.view.View
import android.widget.RadioGroup
import android.widget.Toast
import android.widget.ToggleButton
import com.example.databindingexample.BR
import com.example.databindingexample.R

/**
 * created by Ramanuj Kesharawani on 12/8/19
 */
class InfoModel :BaseObservable() {

    @Bindable
    var termsAndConditions:Boolean=false
    set(value) {
        field=value
        notifyPropertyChanged(BR.termsAndConditions)
    }

    @Bindable
    var toggleChecked:Boolean=false
    set(value) {
        field=value
        notifyPropertyChanged(BR.toggleChecked)
    }

    @Bindable
    var switchFlag:Boolean=false
    set(value) {
        field=value
        notifyPropertyChanged(BR.switchFlag)
    }

   @Bindable
   var hasPermission:Boolean=false
    set(value) {
        field=value
        notifyPropertyChanged(BR.hasPermission)
    }
    @Bindable
    var booleanFlag:Boolean=false
    set(value) {
        field=value
        notifyPropertyChanged(BR.booleanFlag)
    }

    fun onButtonClick(view: View){
        Toast.makeText(view.context,"terms and condition accepted $termsAndConditions \nToggle Checked $toggleChecked \nSwitch flag $switchFlag",Toast.LENGTH_SHORT).show()
    }

    fun onNationalitySelected(radioGroup:RadioGroup,id:Int){
        var message:String?=null
        when(id){
            R.id.radioIndian->{
                message="Indian"
            }
            R.id.radioOther->{
                message="Other"
            }
        }
        Toast.makeText(radioGroup.context,message,Toast.LENGTH_SHORT).show()
    }
}