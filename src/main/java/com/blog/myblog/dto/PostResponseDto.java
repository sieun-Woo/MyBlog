package com.blog.myblog.dto;

import com.blog.myblog.entity.Post;
import com.blog.myblog.entity.Timestamped;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Getter
public class PostResponseDto {

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private Long id;
    private String username;
    private String title;
    private String contents;

    public PostResponseDto(Post post) {
        this.id = post.getId();
        this.createdAt = post.getCreatedAt();
        this.modifiedAt = post.getModifiedAt();
        this.username = post.getUsername();
        this.title  = post.getTitle();
        this.contents = post.getContents();
    }
}
