package com.example.epoxyexample.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkLayer {

    val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://gist.githubusercontent.com/semani2/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val apiService : ApiService = retrofit.create(ApiService::class.java)

    val apiClient = ApiClient(apiService)
}