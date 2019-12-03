package com.example.databindingexample.databinding_adapter.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
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

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): ViewHolder {
        context = viewGroup.context
        val layoutInflater = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var binding: UserLayoutBinding = DataBindingUtil.inflate(layoutInflater, R.layout.user_layout, viewGroup, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        var user = userList[position]
        viewHolder.getLayoutBinding().user = user
        // viewHolder.getLayoutBinding().executePendingBindings()
        viewHolder.getLayoutBinding().root.setOnClickListener {
            onRecyclerClick.onRecyclerItemClick(user)
        }
    }

    inner class ViewHolder(var binding: UserLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun getLayoutBinding(): UserLayoutBinding {
            return binding
        }
    }
}