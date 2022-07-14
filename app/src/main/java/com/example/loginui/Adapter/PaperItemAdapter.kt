package com.example.loginui.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.loginui.Model.PaperItemModel
import com.example.loginui.Model.TestListModel
import com.example.loginui.R
import com.example.loginui.databinding.ItemCardBinding
import com.example.loginui.databinding.PapersItemLayoutBinding

class PaperItemAdapter (var list: MutableList<PaperItemModel>): RecyclerView.Adapter<PaperItemAdapter.MyViewHolder>() {

    inner class MyViewHolder(var binding: PapersItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding: PapersItemLayoutBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context), R.layout.papers_item_layout, parent, false
        )
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = list[position]
        holder.binding.paperTotalTime.text = currentItem.paperTotalTime
        holder.binding.paperToatalQues.text = currentItem.paperTotalQues
        holder.binding.paperTotalMarks.text = currentItem.paperTotalMarks
        holder.binding.paperName.text = currentItem.paperName
        holder.binding.paperLevel.text = currentItem.paperLevel

        holder.itemView.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_quizFragment_to_testStartFragment)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

}