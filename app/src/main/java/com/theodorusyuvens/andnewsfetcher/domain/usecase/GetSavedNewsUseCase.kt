package com.theodorusyuvens.andnewsfetcher.domain.usecase

import com.theodorusyuvens.andnewsfetcher.domain.repository.NewsRepository

class GetSavedNewsUseCase(
    private val repository: NewsRepository
) {
}