package com.example.loginui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.loginui.databinding.ActivityHomeBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_nav)
//        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
//        val navController = navHostFragment.navController
//
        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.cousesbtn-> Toast.makeText(this,"Course",Toast.LENGTH_LONG).show()
                R.id.profileBtn-> Toast.makeText(this,"profile",Toast.LENGTH_LONG).show()
                R.id.settingBtn-> Toast.makeText(this,"setting",Toast.LENGTH_LONG).show()
            }
            true
        }
    }



}