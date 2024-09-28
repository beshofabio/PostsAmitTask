package com.example.amittask.di

import com.example.domain.repo.PostsRepo
import com.example.domain.usecase.GetPosts
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    fun provideUseCase(postsRepo: PostsRepo): GetPosts {
        return GetPosts(postsRepo)
    }
}