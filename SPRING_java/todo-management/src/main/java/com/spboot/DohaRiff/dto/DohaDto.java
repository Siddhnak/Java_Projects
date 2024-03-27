package com.spboot.DohaRiff.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DohaDto {
    private Long id;
    private String title;
    private String description;
//    private boolean completed;
    private String userComments;
    private String author;
    private String source;
}
