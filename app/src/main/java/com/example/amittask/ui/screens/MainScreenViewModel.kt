package com.example.amittask.ui.screens

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.entity.Post
import com.example.domain.usecase.GetPosts
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainScreenViewModel @Inject constructor(
    private val getPostsUseCase: GetPosts
): ViewModel() {

    private val _posts =   MutableStateFlow<List<Post>>(emptyList())
    val posts = _posts.asStateFlow()


    init {
        getPosts()
    }

    private fun getPosts(){
        viewModelScope.launch{
            try {
                _posts.value = getPostsUseCase()
            }catch (e:Exception){
                Log.e("PostsViewModel", e.message.toString())
            }
        }
    }

}