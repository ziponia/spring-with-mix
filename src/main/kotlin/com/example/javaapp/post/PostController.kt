package com.example.javaapp.post

import com.example.javaapp.common.PostEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping

@Controller
class PostController(
    @Autowired val postService: PostService,
    @Autowired val postRepository: PostRepository
) {

    @GetMapping(value = ["/"])
    fun homePage(model: Model): String {
        model["name"] = "kuby"
        val list = postService.retrieve()
        model["list"] = list
        return "index"
    }

    @GetMapping(value = ["/posts/_create", "/posts/{id}/edit"])
    fun managePage(
        @PathVariable(required = false) id: Long?,
        model: Model
    ): String {
        var postEntity: PostEntity? = PostEntity()

        if (id != null) {
            postEntity = postService.get(id)

            if (postEntity == null) {
                return "redirect:/posts/_create"
            }
        }

        model["board"] = postEntity!!
        return "posts/create"
    }

    @PostMapping(value = ["/post"])
    fun manage(postEntity: PostEntity): String {
        postRepository.save(postEntity)
        return "redirect:/"
    }

    @GetMapping(value = ["/post/{id}"])
    fun detail(model: Model, @PathVariable id: Long): String {
        val post = postRepository.findById(id)
            .orElse(null)

        if (post == null) {
            return "redirect:/"
        }

        model["title"] = post.title!!
        model["content"] = post.content!!

        return "detail"
    }
}
