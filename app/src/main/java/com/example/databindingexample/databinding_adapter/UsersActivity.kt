package com.example.databindingexample.databinding_adapter

import androidx.databinding.DataBindingUtil
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.databindingexample.R
import com.example.databindingexample.databinding.ActivityUsersBinding
import com.example.databindingexample.databinding_adapter.adapter.DataBindingAdapter
import com.example.databindingexample.databinding_adapter.model.OnRecyclerClick
import com.example.databindingexample.databinding_adapter.model.User

class UsersActivity : AppCompatActivity(), OnRecyclerClick {
    var list = arrayListOf<User>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding: ActivityUsersBinding = DataBindingUtil.setContentView(this, R.layout.activity_users)
        val user1 = User("ramanuj", "vijay nagar indore")
        val user2 = User("rama", "palasiya indore")
        val user3 = User("anuj", "janjirwala indore")
        list.add(user1)
        list.add(user2)
        list.add(user3)
        var adapter = DataBindingAdapter(list, this)
        binding.recyclerView.adapter = adapter
    }

    override fun onRecyclerItemClick(user: User) {
        user.userName = "updated name"
    }
}
