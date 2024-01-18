package com.example.RestRetrieve;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Post {
    private Long userId;
    private Long id;
    private String title;
    private String body;
}
