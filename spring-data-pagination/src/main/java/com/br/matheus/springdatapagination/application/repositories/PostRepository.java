package com.br.matheus.springdatapagination.application.repositories;

import com.br.matheus.springdatapagination.application.domain.Post;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PostRepository extends PagingAndSortingRepository<Post, Long> {
}
