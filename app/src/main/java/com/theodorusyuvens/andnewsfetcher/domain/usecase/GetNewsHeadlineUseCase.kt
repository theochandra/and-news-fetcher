package com.theodorusyuvens.andnewsfetcher.domain.usecase

import com.theodorusyuvens.andnewsfetcher.domain.repository.NewsRepository

class GetNewsHeadlineUseCase(
    private val repository: NewsRepository
) {
}