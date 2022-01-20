package com.example.finalProject.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _header = MutableLiveData<String>().apply {
        value = "This is Sweet Home "
    }
    private val _article_first = MutableLiveData<String>().apply {
        value = "This is Sweet Home "
    }
    private val _article_second = MutableLiveData<String>().apply {
        value = "This is Sweet Home "
    }

    val header: LiveData<String> = _header
    val article_first: LiveData<String> = _article_first
    val article_second: LiveData<String> = _article_second
}