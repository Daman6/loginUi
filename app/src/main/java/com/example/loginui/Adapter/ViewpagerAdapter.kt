package com.example.loginui.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.loginui.Model.PaperItemModel
import com.example.loginui.Model.QuestionModel
import com.example.loginui.R
import com.example.loginui.databinding.DrawerItemLayoutBinding
import com.example.loginui.databinding.ItemViewpagerBinding
import com.example.loginui.databinding.PapersItemLayoutBinding

class ViewpagerAdapter(val list :MutableList<QuestionModel>):
    RecyclerView.Adapter<ViewpagerAdapter.ViewPagerHolder>() {

    inner class ViewPagerHolder(val binding:ItemViewpagerBinding)
        :RecyclerView.ViewHolder(binding.root){

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        val binding: ItemViewpagerBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context), R.layout.item_viewpager, parent, false
        )
        return ViewPagerHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
        val currentItem = list[position]
        holder.binding.question.text = currentItem.question.toString()
        holder.binding.option1.text = currentItem.option1.toString()
        holder.binding.option2.text = currentItem.option2.toString()
        holder.binding.option3.text = currentItem.option3.toString()
        holder.binding.option4.text = currentItem.option4.toString()

    }

    override fun getItemCount(): Int {
       return list.size
    }
}