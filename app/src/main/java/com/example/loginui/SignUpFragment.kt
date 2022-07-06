package com.example.loginui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.loginui.databinding.FragmentBlankBinding
import com.example.loginui.databinding.FragmentSignUpBinding


class SignUpFragment : Fragment() {

    lateinit var binding : FragmentSignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSignUpBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.text1.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_signUpFragment_to_loginFragment)
        }
        binding.signupBtn.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_signUpFragment_to_homeFragment)
        }
    }
}