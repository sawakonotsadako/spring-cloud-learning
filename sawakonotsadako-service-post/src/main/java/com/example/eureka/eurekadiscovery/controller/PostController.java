package com.example.eureka.eurekadiscovery.controller;

import com.example.eureka.eurekadiscovery.model.Post;
import com.example.eureka.eurekadiscovery.repository.PostRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PostController {

    @Autowired
    PostRepository postRepository;

    @RequestMapping(value = "/post/{id}", method = RequestMethod.GET)
    public Post getPost(String id) {
        log.info("id="+id);

        Post post = postRepository.findById(Long.valueOf(id)).get();

        return post;
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public Post createPost(Post post) {

        postRepository.save(post);

        return post;
    }

    @RequestMapping(value = "/post", method = RequestMethod.PUT)
    public Post updatePost(Post post) {

        return post;
    }

    @RequestMapping(value = "/post/{id}", method = RequestMethod.DELETE)
    public void deletePost(String id) {

        postRepository.deleteById(Long.valueOf(id));
    }
}
