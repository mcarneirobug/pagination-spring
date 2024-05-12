package com.br.matheus.springdatapagination.application.controller;

import com.br.matheus.springdatapagination.application.domain.Post;
import com.br.matheus.springdatapagination.application.services.PostService;

import lombok.RequiredArgsConstructor;

import org.springframework.data.domain.Pageable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/posts")
public class PostController {

  private final PostService service;

  @GetMapping
  public List<Post> listPosts(Pageable pageable) {
    return service.listPosts(pageable).getContent();
  }

}
