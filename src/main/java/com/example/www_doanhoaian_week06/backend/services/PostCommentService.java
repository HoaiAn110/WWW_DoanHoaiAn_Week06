package com.example.www_doanhoaian_week06.backend.services;

import com.example.www_doanhoaian_week06.backend.models.PostComment;
import com.example.www_doanhoaian_week06.backend.repositories.PostCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostCommentService {
    @Autowired
    private PostCommentRepository postCommentRepository;

    public void save(PostComment comment){
        postCommentRepository.save(comment);
    }

    public List<PostComment>findPostCommentsByPostId(long id){
        return postCommentRepository.findPostCommentsByPostId(id);
    }
}
