package com.example.javaapp.post

import com.example.javaapp.common.PostEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository: JpaRepository<PostEntity, Long>
