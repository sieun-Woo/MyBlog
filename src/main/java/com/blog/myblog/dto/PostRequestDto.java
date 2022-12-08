package com.blog.myblog.dto;

import lombok.Getter;

@Getter
public class PostRequestDto {
    private String username;
    private String password;
    private String title;
    private String contents;

}
