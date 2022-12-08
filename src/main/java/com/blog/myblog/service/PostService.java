package com.blog.myblog.service;

import com.blog.myblog.dto.PostRequestDto;
import com.blog.myblog.entity.Post;
import com.blog.myblog.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    @Transactional
    public Post createPost(PostRequestDto requestDto) {
        Post post = new Post(requestDto);
        postRepository.save(post);
        return post;
    }

    @Transactional(readOnly = true)
    public List<Post> getPost() {
        return postRepository.findAllByOrderByModifiedAtDesc();
    }

    @Transactional(readOnly = true)
    public Post getPostById(Long id) {
        return postRepository.findPostById(id);
    }

    @Transactional
    public Post updatePost(Long id, PostRequestDto requestDto) {
        Post post = postRepository.findPostById(id);
        if(!post.getPassword().equals(requestDto.getPassword())){
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
        }
        post.update(requestDto);
        return getPostById(id);
    }


    public String deletePost(Long id, PostRequestDto requestDto) {
        Post post = postRepository.findPostById(id);
        if(!post.getPassword().equals(requestDto.getPassword())){
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
        }
        postRepository.delete(postRepository.findPostById(id));
        return "포스트를 삭제하였습니다.";
    }
}
