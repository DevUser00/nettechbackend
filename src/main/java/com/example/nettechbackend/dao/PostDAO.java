package com.example.nettechbackend.dao;

import com.example.nettechbackend.model.Post;
import com.example.nettechbackend.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostDAO {

  private final PostRepository postRepository;

  public PostDAO(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public void savePost(Post post){
    postRepository.save(post);
  }
}
