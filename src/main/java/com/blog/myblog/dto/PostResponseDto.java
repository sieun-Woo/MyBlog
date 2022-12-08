package com.blog.myblog.dto;

import com.blog.myblog.entity.Post;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class PostResponseDto {
    private String username;
    private String title;
    private String contents;

    public PostResponseDto(Post post) {
        this.username = post.getUsername();
        this.title  = post.getTitle();
        this.contents = post.getContents();
    }
}
