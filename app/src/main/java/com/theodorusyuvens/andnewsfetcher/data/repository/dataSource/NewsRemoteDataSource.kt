package com.theodorusyuvens.andnewsfetcher.data.repository.dataSource

import com.theodorusyuvens.andnewsfetcher.data.model.APIResponse
import retrofit2.Response

interface NewsRemoteDataSource {

    suspend fun getTopHeadlines(): Response<APIResponse>

}