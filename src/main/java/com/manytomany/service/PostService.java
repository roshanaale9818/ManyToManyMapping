package com.manytomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manytomany.model.Post;
import com.manytomany.repository.PostRepository;

@Service
public class PostService {
	@Autowired
	private PostRepository postRepository;
	
	public Post addPost(Post post) {
		return postRepository.save(post);
	}
	
	public Post getPostById(Long id) {
		return postRepository.findById(id).get();	
	}
	
	public List<Post> getAllPosts() {
		return postRepository.findAll();
	}
	public void deletePostById(long postId) {
		postRepository.deleteById(postId);
	}
	
	
	

}
