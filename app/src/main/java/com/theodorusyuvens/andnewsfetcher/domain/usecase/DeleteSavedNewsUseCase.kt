package com.theodorusyuvens.andnewsfetcher.domain.usecase

import com.theodorusyuvens.andnewsfetcher.data.model.Article
import com.theodorusyuvens.andnewsfetcher.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(
    private val repository: NewsRepository
) {

    suspend fun execute(article: Article) = repository.deleteNews(article)

}