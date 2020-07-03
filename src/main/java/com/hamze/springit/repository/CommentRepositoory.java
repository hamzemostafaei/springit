package com.hamze.springit.repository;

import com.hamze.springit.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepositoory extends JpaRepository<Comment,Long> {
}
