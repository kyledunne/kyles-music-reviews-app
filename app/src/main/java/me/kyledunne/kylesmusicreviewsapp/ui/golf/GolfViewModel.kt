package me.kyledunne.kylesmusicreviewsapp.ui.golf

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GolfViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is golf Fragment"
    }
    val text: LiveData<String> = _text
}