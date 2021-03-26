package com.theodorusyuvens.andnewsfetcher.domain.usecase

import com.theodorusyuvens.andnewsfetcher.data.model.APIResponse
import com.theodorusyuvens.andnewsfetcher.data.util.Resource
import com.theodorusyuvens.andnewsfetcher.domain.repository.NewsRepository

class GetSearchedNewsUseCase(
    private val repository: NewsRepository
) {

    suspend fun execute(query: String): Resource<APIResponse> {
        return repository.getSearchedNews(query)
    }

}