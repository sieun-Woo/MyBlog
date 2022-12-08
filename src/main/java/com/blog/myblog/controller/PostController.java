package com.blog.myblog.controller;

import com.blog.myblog.dto.PostRequestDto;
import com.blog.myblog.dto.PostResponseDto;
import com.blog.myblog.entity.Post;
import com.blog.myblog.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    //전체 게시글 목록을 조회하는 API (Read)
    @GetMapping("/api/post")
    public ArrayList<PostResponseDto> getPost() {
        return postService.getPost();
    }

    //id를 통해 게시글을 조회하는 API (Read)
    @GetMapping("/api/post/{id}")
    public PostResponseDto getPostById(@PathVariable Long id) {
        return postService.getPostById(id);
    }

    //게시글을 작성하는 API (Create)
    @PostMapping("/api/post")
    public PostResponseDto createPost(@RequestBody PostRequestDto requestDto) {
        return postService.createPost(requestDto);
    }

    //게시글을 수정하는 API (Update)
    @PutMapping("/api/post/{id}")
    public PostResponseDto updatePost(@PathVariable Long id, @RequestBody PostRequestDto requestDto) {
        return postService.updatePost(id, requestDto);
    }

    //게시글을 삭제하는 API (Delete)
    @DeleteMapping("/api/post/{id}")
    public String deletePost(@PathVariable Long id, @RequestBody PostRequestDto requestDto) {
        return postService.deletePost(id, requestDto);
    }


}
