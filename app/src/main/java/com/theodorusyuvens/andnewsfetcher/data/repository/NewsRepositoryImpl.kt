package com.theodorusyuvens.andnewsfetcher.data.repository

import com.theodorusyuvens.andnewsfetcher.data.model.APIResponse
import com.theodorusyuvens.andnewsfetcher.data.model.Article
import com.theodorusyuvens.andnewsfetcher.data.repository.dataSource.NewsRemoteDataSource
import com.theodorusyuvens.andnewsfetcher.data.util.Resource
import com.theodorusyuvens.andnewsfetcher.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

class NewsRepositoryImpl(
    private val remoteDataSource: NewsRemoteDataSource
) : NewsRepository {

    override suspend fun getNewsHeadline(): Resource<APIResponse> {
        return responseToResult(remoteDataSource.getTopHeadlines())
    }

    private fun responseToResult(response: Response<APIResponse>): Resource<APIResponse> {
        if (response.isSuccessful) {
            response.body()?.let { result ->
                return Resource.Success(result)
            }
        }
        return Resource.Error(response.message())
    }

    override suspend fun getSearchedNews(query: String): Resource<APIResponse> {
        TODO("Not yet implemented")
    }

    override suspend fun saveNews(article: Article) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteNews(article: Article) {
        TODO("Not yet implemented")
    }

    override fun getSavedNews(): Flow<List<Article>> {
        TODO("Not yet implemented")
    }

}