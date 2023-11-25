package com.example.www_doanhoaian_week06.backend.services;

import com.example.www_doanhoaian_week06.backend.models.Post;
import com.example.www_doanhoaian_week06.backend.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public void save(Post post){ postRepository.save(post); }

    public List<Post> getAllPublish(){
        return postRepository.findAllByPublishedTrue();
    }

    public Optional<Post>findByIdAndPublishTrue(Long id){
        return postRepository.findByIdAndPublishedTrue(id);
    }

    public List<Post>findByAuthorId(long id){
        return postRepository.findAllByPublishedTrueAndAuthorId(id);
    }
}
