package com.br.matheus.springdatapagination.application.services.impl;

import com.br.matheus.springdatapagination.application.domain.Post;

import com.br.matheus.springdatapagination.application.repositories.PostRepository;

import com.br.matheus.springdatapagination.application.services.PostService;

import lombok.RequiredArgsConstructor;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

  private final PostRepository repository;

  @Override
  public Page<Post> listPosts(final Pageable pageable) {
    return repository.findAll(pageable);
  }
}
