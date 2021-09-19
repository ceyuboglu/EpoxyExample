package com.example.epoxyexample.data.entity


import com.google.gson.annotations.SerializedName

data class Detail(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("plot")
    val plot: String,
    @SerializedName("poster")
    val poster: String,
    @SerializedName("rootId")
    val rootId: Int
)