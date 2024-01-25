package com.example.workout.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyinfoViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is 기록 Fragment"
    }
    val text: LiveData<String> = _text
}