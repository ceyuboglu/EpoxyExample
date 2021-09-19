package com.example.epoxyexample.data

import com.example.epoxyexample.data.entity.BaseApiResponse

class Repository {
    suspend fun getCharacters() : BaseApiResponse? {
        val request = NetworkLayer.apiClient.getCharacters()
        if (request.isSuccessful){
            return request.body()!!
        }
        return null
    }
}