package com.example.kotlin1_homework4.fragments.fragment_one

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin1_homework4.viewmodel.SharedViewModel
import com.example.kotlin1_homework4.databinding.FragmentOneBinding

class FragmentOne : Fragment() {

    private lateinit var binding: FragmentOneBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentOneBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        binding.btnPlus.setOnClickListener {
            viewModel.onIncrementClick()
        }

        binding.btnMinus.setOnClickListener {
            viewModel.onDecrementClick()
        }
    }

}