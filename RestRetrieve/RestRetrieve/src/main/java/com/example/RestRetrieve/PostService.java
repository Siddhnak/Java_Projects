package com.example.RestRetrieve;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

public class PostService {

    private static final Logger log = LoggerFactory.getLogger(PostService.class);

    private final String apiUrl = "https://jsonplaceholder.typicode.com/posts";

//    private final String apiUrl = "https://jsonplaceholder.typicode.com/posts";

    private final RestTemplate restTemplate;

    public PostService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Post[] getPosts() {
        log.info("Fetching posts from API: {}", apiUrl);
        Post[] posts = restTemplate.getForObject(apiUrl, Post[].class);
        log.info("Retrieved {} posts", posts.length);
        return posts;    }
}
