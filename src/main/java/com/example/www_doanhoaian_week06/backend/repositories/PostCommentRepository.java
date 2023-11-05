package com.example.www_doanhoaian_week06.backend.repositories;

import com.example.www_doanhoaian_week06.backend.models.PostComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostCommentRepository extends JpaRepository<PostComment, Long> {
}
