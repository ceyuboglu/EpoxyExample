package com.example.epoxyexample.data

import com.example.epoxyexample.data.entity.BaseApiResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("121cd98135cd5a5b61593c41c2179220/raw/bbb93730cec1d5e0cd72ed44e56959bc62f47ba4/marvel.json")
    suspend fun getCharacters():Response<BaseApiResponse>

}