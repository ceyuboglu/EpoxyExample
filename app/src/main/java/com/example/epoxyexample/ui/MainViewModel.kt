package com.example.epoxyexample.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.epoxyexample.data.Repository
import com.example.epoxyexample.data.entity.BaseApiResponse
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    private val repository = Repository()
    private val _charactersLiveData = MutableLiveData<BaseApiResponse>()
    val charactersLiveData : LiveData<BaseApiResponse> = _charactersLiveData

    fun getAllCharacters(){
        viewModelScope.launch {
            val response = repository.getCharacters()
            _charactersLiveData.postValue(response)
        }
    }
}