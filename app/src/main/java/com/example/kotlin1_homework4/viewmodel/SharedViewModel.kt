package com.example.kotlin1_homework4.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData

class SharedViewModel: ViewModel() {

    private var counter = 0

    val counterResult = MutableLiveData<Int>()
    val clickedButton = MutableLiveData<String>()

    fun onIncrementClick() {
        counter++
        counterResult.value = counter
    }

    fun onDecrementClick() {
        counter--
        counterResult.value = counter
    }

    fun clicked(btnText: String?) {
        clickedButton.value = btnText
    }

    fun getClicked(): LiveData<String?> {
        return clickedButton
    }
}