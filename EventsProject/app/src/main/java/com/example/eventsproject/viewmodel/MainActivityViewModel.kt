package com.example.eventsproject.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.eventsproject.model.Event

class MainActivityViewModel:ViewModel() {
    var lst = MutableLiveData<ArrayList<Event>>()
    var newList = arrayListOf<Event>()
    fun add(event: Event) {
        newList.add(event)
        lst.value = newList
    }
    fun remove(event: Event){
        newList.remove(event)
        lst.value=newList
    }
}