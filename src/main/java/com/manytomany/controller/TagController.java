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

import com.manytomany.model.Tag;
import com.manytomany.service.TagService;

@RestController
@RequestMapping("/tags")
public class TagController {
	@Autowired
	private TagService tagService;
	
	
	@GetMapping
	public List<Tag> getTags(){
		return tagService.getAllTags();
	}
	
	@GetMapping("{tagId}")
	public Tag  getTag(@PathVariable Long tagId) {
		return tagService.getTagById(tagId);
	}
	@PostMapping
	public Tag addTag(@RequestBody Tag tag) {
		return tagService.addTag(tag);
	}
	
	
	@DeleteMapping("{tagId}")
	public void deleteTag() {
		
	}
	
	
	
	

}
