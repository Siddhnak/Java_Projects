package com.example.RestRetrieve;

import org.springframework.web.bind.annotation.GetMapping;

public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public Post[] getPosts() {
        return postService.getPosts();
    }
}
