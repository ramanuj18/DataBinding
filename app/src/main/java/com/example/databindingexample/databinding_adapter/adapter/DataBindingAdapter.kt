package com.example.databindingexample.databinding_adapter.adapter

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.databindingexample.R
import com.example.databindingexample.databinding.UserLayoutBinding
import com.example.databindingexample.databinding_adapter.model.OnRecyclerClick
import com.example.databindingexample.databinding_adapter.model.User

/**
 * created by Ramanuj Kesharawani on 29/7/19
 */
class DataBindingAdapter(var userList: List<User>, var onRecyclerClick: OnRecyclerClick) :
    RecyclerView.Adapter<DataBindingAdapter.ViewHolder>() {

    private var context: Context? = null

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        context = p0.context
        val layoutInflater = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var binding: UserLayoutBinding = DataBindingUtil.inflate(layoutInflater, R.layout.user_layout, p0, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        var user = userList[p1]
        p0.getLayoutBinding().user = user
       // p0.getLayoutBinding().executePendingBindings()
        p0.getLayoutBinding().root.setOnClickListener {
            onRecyclerClick.onRecyclerItemClick(user)
        }
    }

    inner class ViewHolder(var binding: UserLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun getLayoutBinding(): UserLayoutBinding {
            return binding
        }
    }
}