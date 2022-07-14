package com.example.loginui.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.loginui.Model.PaperItemModel
import com.example.loginui.Model.QuestionModel
import com.example.loginui.R
import com.example.loginui.databinding.ItemViewpagerBinding
import com.example.loginui.databinding.PapersItemLayoutBinding

class ViewpagerAdapter(val list :MutableList<PaperItemModel>):
    RecyclerView.Adapter<ViewpagerAdapter.ViewPagerHolder>() {

    inner class ViewPagerHolder(val binding: PapersItemLayoutBinding)
        :RecyclerView.ViewHolder(binding.root){

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        val binding: PapersItemLayoutBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context), R.layout.papers_item_layout, parent, false
        )
        return ViewPagerHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
        val currentItem = list[position]
        holder.binding.paperTotalTime.text = currentItem.paperTotalTime
        holder.binding.paperToatalQues.text = currentItem.paperTotalQues
        holder.binding.paperTotalMarks.text = currentItem.paperTotalMarks
        holder.binding.paperName.text = currentItem.paperName
        holder.binding.paperLevel.text = currentItem.paperLevel

    }

    override fun getItemCount(): Int {
       return list.size
    }
}