package com.example.loginui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.loginui.Adapter.UserAdapter
import com.example.loginui.Model.UserModel
import com.example.loginui.databinding.FragmentCoursesBinding


class CoursesFragment : Fragment() {


    lateinit var binding: FragmentCoursesBinding
    lateinit var userAdapter: UserAdapter
    lateinit var list: MutableList<UserModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCoursesBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list = mutableListOf<UserModel>()
        list.add(UserModel("Photography","dd"))
        list.add(UserModel("Music Class","dd"))
        list.add(UserModel("ESE & GATE CE","dd"))
        list.add(UserModel("ESE & GATE ME","dd"))
        binding.recyclerView.apply {
            adapter = UserAdapter(list)
            layoutManager = GridLayoutManager(requireContext(),2)
        }
    }


}