package com.theodorusyuvens.andnewsfetcher.domain.usecase

import com.theodorusyuvens.andnewsfetcher.data.model.Article
import com.theodorusyuvens.andnewsfetcher.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(
    private val repository: NewsRepository
) {

    fun execute(): Flow<List<Article>> {
        return repository.getSavedNews();
    }

}