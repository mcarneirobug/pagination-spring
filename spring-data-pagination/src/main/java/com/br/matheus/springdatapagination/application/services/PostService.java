package com.br.matheus.springdatapagination.application.services;

import com.br.matheus.springdatapagination.application.domain.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PostService {
  Page<Post> listPosts(Pageable pageable);
}
