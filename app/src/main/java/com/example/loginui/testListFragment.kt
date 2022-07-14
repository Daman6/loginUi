package com.example.loginui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.loginui.Adapter.TestListAdapter
import com.example.loginui.Adapter.UserAdapter
import com.example.loginui.Model.TestListModel
import com.example.loginui.Model.UserModel
import com.example.loginui.databinding.FragmentCoursesBinding
import com.example.loginui.databinding.FragmentSignUpBinding
import com.example.loginui.databinding.FragmentTestListBinding

class testListFragment : Fragment() {
    lateinit var binding: FragmentTestListBinding
    lateinit var testListAdapter: TestListAdapter
    lateinit var list: MutableList<TestListModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTestListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list = mutableListOf<TestListModel>()
        list.add(TestListModel("Science","40+","dd"))
        list.add(TestListModel("Maths","20+","dd"))
        list.add(TestListModel("English","100+","dd"))
        list.add(TestListModel("sst","30+","dd"))
        binding.recyclerView.apply {
            adapter = TestListAdapter(list)
            layoutManager = GridLayoutManager(requireContext(),2)
        }
    }

}