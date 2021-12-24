package com.example.kotlin1_homework4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin1_homework4.databinding.ActivityMainBinding
import com.example.kotlin1_homework4.fragments.ViewPagerFragmentAdapter
import com.example.kotlin1_homework4.fragments.fragment_one.FragmentOne
import com.example.kotlin1_homework4.fragments.fragment_three.FragmentThree
import com.example.kotlin1_homework4.fragments.fragment_two.FragmentTwo
import com.example.kotlin1_homework4.viewmodel.SharedViewModel


class MainActivity : AppCompatActivity() {

    private lateinit var myAdapter: ViewPagerFragmentAdapter
    private lateinit var binding: ActivityMainBinding
    lateinit var viewModel: SharedViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(SharedViewModel::class.java)

        myAdapter = ViewPagerFragmentAdapter(supportFragmentManager, lifecycle)

        myAdapter.addFragment(FragmentOne())
        myAdapter.addFragment(FragmentTwo())
        myAdapter.addFragment(FragmentThree())
        binding.viewPagerMain.adapter = myAdapter
    }
}