package com.example.www_doanhoaian_week06.backend.repositories;

import com.example.www_doanhoaian_week06.backend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
