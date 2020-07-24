package com.manage.employee.manageEmployee.repository;

import com.manage.employee.manageEmployee.model.Post;
import com.manage.employee.manageEmployee.model.Subreddit;
import com.manage.employee.manageEmployee.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
