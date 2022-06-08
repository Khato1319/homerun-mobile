package com.hci.homerun.ui.routines

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RoutinesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is routines Fragment"
    }
    val text: LiveData<String> = _text
}