package com.couchbase.kotlin_addressbook.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _firstName = MutableLiveData<String>().apply {
        value = "Joe"
    }
    val firstName: LiveData<String> = _firstName
}