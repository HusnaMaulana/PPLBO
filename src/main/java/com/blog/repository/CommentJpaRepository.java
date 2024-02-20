package com.blog.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.stereotype.Repository;


import com.blog.vo.Comment;

@Repository("commentJpaRepository")
public interface CommentJpaRepository extends JpaRepository<Comment, Serializable> {
    Comment findOneById(long id);
    List<Comment> findByPostIdOrderByRegDateDesc(Long postId);
    List<Comment> findByPostIdAndCommentContainingOrderByRegDateAsc(Long postId, String query);
}
