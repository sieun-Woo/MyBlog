package com.blog.myblog.dto;

import com.blog.myblog.entity.Post;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class PostRequestDto {
    private String username;
    private String password;
    private String title;
    private String contents;

}
