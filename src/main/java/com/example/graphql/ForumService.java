package com.example.graphql;

import com.example.graphql.Comment;
import com.example.graphql.Post;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

// serviço para o post
@Service
class PostService{
    Map<String, Post> posts = new HashMap<>();

    // method post
    Collection<Post> createPost(String content) {
        var newPost = new Post(UUID.randomUUID().toString(),content);
        posts.put(newPost.id(), newPost);

        return posts.values();
    }

    // consultar por id
    Post postByeId(String id) {
        return posts.get(id);
    }
}

//serviço para o comentario
@Service
class CommentService{
    Map<String, Comment> comments = new HashMap<>();

    // method comentario
    Collection<Comment> createComment(String content, String postId) {
        var newComment = new Comment(UUID.randomUUID().toString(), content, postId);
        comments.put(newComment.id(), newComment);
        return comments.values();
    }
}
