package com.manytomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manytomany.model.Post;
import com.manytomany.service.PostService;

@RestController
@RequestMapping("/posts")
public class PostController {
	@Autowired 
	private PostService postService;
	
	@PostMapping
	public Post addPost(@RequestBody Post post) {
		return postService.addPost(post);
		
	}
	@GetMapping("{postId}")
	public Post getPost(@PathVariable Long postId) {
		return postService.getPostById(postId);
	}
	@GetMapping
	public List<Post> getAllPost(){
		return postService.getAllPosts();
	}
	
	@DeleteMapping("{postId}")
	public void deletePostById(@PathVariable long postId) {
		postService.deletePostById(postId);
		
	}
	
	
	

}
