package com.theodorusyuvens.andnewsfetcher.domain.repository

import com.theodorusyuvens.andnewsfetcher.data.model.APIResponse
import com.theodorusyuvens.andnewsfetcher.data.model.Article
import com.theodorusyuvens.andnewsfetcher.data.util.Resource
import kotlinx.coroutines.flow.Flow

interface NewsRepository {

    suspend fun getNewsHeadline(): Resource<APIResponse>

    suspend fun getSearchedNews(query: String): Resource<APIResponse>

    suspend fun saveNews(article: Article)

    suspend fun deleteNews(article: Article)

    fun getSavedNews(): Flow<List<Article>> // because it use flow, we don't need to use suspend function

}