package com.theodorusyuvens.andnewsfetcher.data.model

import com.google.gson.annotations.SerializedName

data class APIResponse(
    @SerializedName("status")
    val articles: List<Article>,
    @SerializedName("totalResults")
    val status: String,
    @SerializedName("articles")
    val totalResults: Int,
)
