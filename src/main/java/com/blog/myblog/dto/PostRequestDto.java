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

    public PostRequestDto(Post post) {
        this.password = post.getPassword();
        this.username = post.getUsername();
        this.title  = post.getTitle();
        this.contents = post.getContents();
    }
}
