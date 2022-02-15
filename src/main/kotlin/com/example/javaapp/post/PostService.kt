package com.example.javaapp.post

import com.example.javaapp.common.PostEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PostService(
    @Autowired val postRepository: PostRepository,
) {

    /**
     * public BoardEntity get(Long id) {
     *
     * }
     */
    fun get(id: Long): PostEntity? {
        return postRepository.findById(id).orElse(null)
    }

    fun retrieve(): List<PostEntity> {
        return postRepository.findAll()
    }
}
