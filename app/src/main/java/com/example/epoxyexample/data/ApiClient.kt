package com.example.epoxyexample.data

import com.example.epoxyexample.data.entity.BaseApiResponse
import retrofit2.Response

class ApiClient(
    private val apiService: ApiService
) {
    suspend fun getCharacters(): Response<BaseApiResponse> {
        return apiService.getCharacters()
    }
}