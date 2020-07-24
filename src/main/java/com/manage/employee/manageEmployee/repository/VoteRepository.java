package com.manage.employee.manageEmployee.repository;

import com.manage.employee.manageEmployee.model.Post;
import com.manage.employee.manageEmployee.model.User;
import com.manage.employee.manageEmployee.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
