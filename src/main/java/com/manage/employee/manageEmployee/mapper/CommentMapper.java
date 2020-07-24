package com.manage.employee.manageEmployee.mapper;

import com.manage.employee.manageEmployee.dto.CommentsDto;
import com.manage.employee.manageEmployee.model.Comment;
import com.manage.employee.manageEmployee.model.Post;
import com.manage.employee.manageEmployee.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CommentMapper {
    @Mappings({
            @Mapping(target = "id", ignore = true),
            @Mapping(target = "text", source = "commentsDto.text"),
            @Mapping(target = "createdDate", expression = "java(java.time.Instant.now())"),
            @Mapping(target = "post", source = "post"),
            @Mapping(target = "user", source = "user")
    })

    Comment map(CommentsDto commentsDto, Post post, User user);

    @Mappings({
            @Mapping(target = "postId", expression = "java(comment.getPost().getPostId())"),
            @Mapping(target = "userName", expression = "java(comment.getUser().getUsername())")
    })
    CommentsDto mapToDto(Comment comment);
}