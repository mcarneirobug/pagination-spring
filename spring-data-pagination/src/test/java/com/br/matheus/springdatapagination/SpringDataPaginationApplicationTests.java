package com.br.matheus.springdatapagination;

import com.br.matheus.springdatapagination.application.domain.Post;
import com.br.matheus.springdatapagination.application.services.PostService;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringDataPaginationApplicationTests {

	static final Post POST_01 = new Post(1L, "Subscribe on channel", "@roulettemaster");
	static final Post POST_02 = new Post(2L, "Turn on notifications", "@ghostroulette");

	@Autowired
	PostService service;

	@Test
	void shouldListPostsPaginated() {
		// given
		final PageRequest pageRequest = PageRequest.of(0, 2);

		// then
		final Page<Post> postPage = service.listPosts(pageRequest);

		assertAll(
				() -> assertEquals(2, postPage.getContent().size()),
				() -> assertEquals(POST_01, postPage.getContent().get(0)),
				() -> assertEquals(POST_02, postPage.getContent().get(1))
		);
	}
}
