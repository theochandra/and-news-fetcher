package com.theodorusyuvens.andnewsfetcher.domain.usecase

import com.theodorusyuvens.andnewsfetcher.domain.repository.NewsRepository

class SaveNewsUseCase(
    private val repository: NewsRepository
) {
}