package com.example.data.repo

import com.example.data.remote.ApiService
import com.example.domain.entity.Post
import com.example.domain.repo.PostsRepo

class PostsRepoImpl (private val apiService : ApiService) : PostsRepo {
    override suspend fun getPostsFromRemote(): List<Post> = apiService.getPosts()
}