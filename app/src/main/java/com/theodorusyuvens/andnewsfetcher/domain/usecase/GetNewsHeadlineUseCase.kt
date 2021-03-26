package com.theodorusyuvens.andnewsfetcher.domain.usecase

import com.theodorusyuvens.andnewsfetcher.data.model.APIResponse
import com.theodorusyuvens.andnewsfetcher.data.util.Resource
import com.theodorusyuvens.andnewsfetcher.domain.repository.NewsRepository

class GetNewsHeadlineUseCase(
    private val repository: NewsRepository
) {

    suspend fun execute(): Resource<APIResponse> {
        return repository.getNewsHeadline()
    }

}