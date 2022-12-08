package com.blog.myblog.entity;

import com.blog.myblog.dto.PostRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity(name = "Post")
@Getter
@RequiredArgsConstructor
public class Post extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String contents;

    public Post(PostRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.password = requestDto.getPassword();
        this.title  = requestDto.getTitle();
        this.contents = requestDto.getContents();
    }

    public void update(PostRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.password = requestDto.getPassword();
        this.title  = requestDto.getTitle();
        this.contents = requestDto.getContents();
    }
}
