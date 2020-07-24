package com.manage.employee.manageEmployee.repository;

import com.manage.employee.manageEmployee.model.Comment;
import com.manage.employee.manageEmployee.model.Post;
import com.manage.employee.manageEmployee.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
