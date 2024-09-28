package com.example.amittask.di

import com.example.data.remote.ApiService
import com.example.data.repo.PostsRepoImpl
import com.example.domain.repo.PostsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    fun provideRepo(apiService: ApiService) : PostsRepo {
        return PostsRepoImpl(apiService)
    }

}