package com.example.domain.repo

import com.example.domain.entity.Post

interface PostsRepo {
    suspend fun getPostsFromRemote() : List<Post>

}