package com.blog.myblog.service;

import com.blog.myblog.dto.PostRequestDto;
import com.blog.myblog.dto.PostResponseDto;
import com.blog.myblog.entity.Post;
import com.blog.myblog.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    @Transactional
    public PostResponseDto createPost(PostRequestDto requestDto) {
        Post post = new Post(requestDto);
        postRepository.save(post);
        return new PostResponseDto(post);
    }

    @Transactional(readOnly = true)
    public ArrayList<PostResponseDto> getPost() {
        ArrayList<PostResponseDto> PostResponseDtoList = new ArrayList<>();
        for(Post post : postRepository.findAllByOrderByModifiedAtDesc()) {
            PostResponseDto postResponseDto = new PostResponseDto(post);
            PostResponseDtoList.add(postResponseDto);
        }
        return PostResponseDtoList;
    }

    @Transactional(readOnly = true)
    public PostResponseDto getPostById(Long id) {
        return new PostResponseDto(postRepository.findPostById(id));
    }

    @Transactional
    public PostResponseDto updatePost(Long id, PostRequestDto requestDto) {
        Post post = postRepository.findPostById(id);
        if(!post.getPassword().equals(requestDto.getPassword())){
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
        }
        post.update(requestDto);
        return getPostById(id);
    }

    @Transactional
    public String deletePost(Long id, PostRequestDto requestDto) {
        Post post = postRepository.findPostById(id);
        if(!post.getPassword().equals(requestDto.getPassword())){
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
        }
        postRepository.delete(postRepository.findPostById(id));
        return "포스트를 삭제하였습니다.";
    }
}
