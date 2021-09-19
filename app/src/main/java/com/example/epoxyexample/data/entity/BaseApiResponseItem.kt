package com.example.epoxyexample.data.entity


import com.google.gson.annotations.SerializedName

data class BaseApiResponseItem(
    @SerializedName("color")
    val color: String,
    @SerializedName("details")
    val details: List<Detail>,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("poster")
    val poster: String,
    @SerializedName("quote")
    val quote: String
)