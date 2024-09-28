package com.example.domain.usecase

import com.example.domain.repo.PostsRepo

class GetPosts (private val postsRepo : PostsRepo) {
    suspend operator fun invoke() = postsRepo.getPostsFromRemote()

}