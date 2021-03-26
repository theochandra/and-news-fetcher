package com.theodorusyuvens.andnewsfetcher.data.api

import com.theodorusyuvens.andnewsfetcher.BuildConfig
import com.theodorusyuvens.andnewsfetcher.data.model.APIResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("v2/top-headlines")
    suspend fun getTopHeadlines(
        @Query("country")
        country: String,
        @Query("page")
        page: Int,
        @Query("apiKey")
        apiKey: String = BuildConfig.API_KEY
    ): Response<APIResponse>

}