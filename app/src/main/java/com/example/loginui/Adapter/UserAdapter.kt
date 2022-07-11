package com.example.loginui.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.loginui.Model.UserModel
import com.example.loginui.R
import com.example.loginui.databinding.ItemCardBinding

class UserAdapter(var list: MutableList<UserModel>):RecyclerView.Adapter<UserAdapter.MyViewHolder>() {

    inner class MyViewHolder(var binding: ItemCardBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding: ItemCardBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context), R.layout.item_card, parent, false
        )
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = list[position]
        holder.binding.userName.text = currentItem.name

        holder.itemView.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_coursesFragment_to_testListFragment)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }


}