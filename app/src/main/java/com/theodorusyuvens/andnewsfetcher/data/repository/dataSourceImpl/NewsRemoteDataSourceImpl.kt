package com.theodorusyuvens.andnewsfetcher.data.repository.dataSourceImpl

import com.theodorusyuvens.andnewsfetcher.data.api.ApiService
import com.theodorusyuvens.andnewsfetcher.data.model.APIResponse
import com.theodorusyuvens.andnewsfetcher.data.repository.dataSource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val service: ApiService,
    private val country: String,
    private val page: Int
) : NewsRemoteDataSource {

    override suspend fun getTopHeadlines(): Response<APIResponse> {
        return service.getTopHeadlines(country, page)
    }

}