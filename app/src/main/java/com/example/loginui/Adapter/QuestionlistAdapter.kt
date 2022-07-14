package com.example.loginui.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.loginui.R
import com.example.loginui.databinding.DrawerItemLayoutBinding

class QuestionlistAdapter (var list: MutableList<Int>):
    RecyclerView.Adapter<QuestionlistAdapter.MyViewHolder>() {

    inner class MyViewHolder(var binding: DrawerItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionlistAdapter.MyViewHolder {
        val binding: DrawerItemLayoutBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context), R.layout.drawer_item_layout, parent, false
        )
        return MyViewHolder(binding)
    }


    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = list[position]
        holder.binding.quesNo.text = currentItem.toString()
    }


}