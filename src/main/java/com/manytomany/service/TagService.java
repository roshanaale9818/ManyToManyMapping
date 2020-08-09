package com.manytomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.manytomany.model.Tag;
import com.manytomany.repository.TagRepository;

@Service
public class TagService {
	@Autowired
	private TagRepository tagRepository;
	
	
	public Tag addTag(Tag tag) {
		return tagRepository.save(tag);
	}
	
	public Tag getTagById(Long id) {
		return tagRepository.findById(id).get();	
	}
	
	public List<Tag> getAllTags() {
		return tagRepository.findAll();
	}

}
