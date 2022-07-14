package com.example.loginui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.example.loginui.Adapter.QuestionlistAdapter
import com.example.loginui.Adapter.ViewpagerAdapter
import com.example.loginui.Model.QuestionModel
import com.example.loginui.databinding.FragmentQuizBinding
import com.example.loginui.databinding.FragmentTestStartBinding

class TestStartFragment : Fragment() {


    lateinit var binding: FragmentTestStartBinding

    lateinit var qlist: MutableList<QuestionModel>
    lateinit var toogle : ActionBarDrawerToggle
    lateinit var qnolist: MutableList<Int>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTestStartBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        qlist = mutableListOf<QuestionModel>()
        qlist.add(QuestionModel("what is my name",4,1,"daman","baman","raman","chaman"))
        qlist.add(QuestionModel("what is my name",4,2,"daman","baman","raman","chaman"))
        qlist.add(QuestionModel("what is my name",4,3,"daman","baman","raman","chaman"))
        qlist.add(QuestionModel("what is my name",4,4,"daman","baman","raman","chaman"))


        qnolist = mutableListOf<Int>()
        for (i in 1..30) {
            qnolist.add(i)
        }
        binding.recyclerView.apply {
            adapter = QuestionlistAdapter(qnolist)
            layoutManager = GridLayoutManager(requireContext(),4)
        }


        var ad = ViewpagerAdapter(qlist)
        binding.viewpager2.adapter = ad
        binding.viewpager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL


        toogle = ActionBarDrawerToggle(requireActivity(),binding.drawerLayout,R.string.open,R.string.close)
        binding.drawerLayout.addDrawerListener(toogle)
        toogle.syncState()

    }
}