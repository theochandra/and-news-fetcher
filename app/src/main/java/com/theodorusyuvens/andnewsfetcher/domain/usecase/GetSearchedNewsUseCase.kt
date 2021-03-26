package com.theodorusyuvens.andnewsfetcher.domain.usecase

import com.theodorusyuvens.andnewsfetcher.domain.repository.NewsRepository

class GetSearchedNewsUseCase(
    private val repository: NewsRepository
) {
}