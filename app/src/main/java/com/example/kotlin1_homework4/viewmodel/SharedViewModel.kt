package com.example.kotlin1_homework4.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {

    private var counter = 0

    val livedata = MutableLiveData<Int>()

    fun onIncrementClick() {
        counter++
        livedata.value = counter
    }

    fun onDecrementClick() {
        counter--
        livedata.value = counter
    }

}