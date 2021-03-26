package com.theodorusyuvens.andnewsfetcher.domain.usecase

import com.theodorusyuvens.andnewsfetcher.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(
    private val repository: NewsRepository
) {
}