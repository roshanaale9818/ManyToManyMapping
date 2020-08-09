package com.manytomany.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "posts")
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String content;
	private String description;
	private Date posted_At = new Date();
	private String title;
	
	
	//we pass third table name at jointable annotation
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable(name = "posts_tags",
	joinColumns = {@JoinColumn(name = "post_id")},
	inverseJoinColumns = {@JoinColumn(name="tag_id")})
	private List<Tag> tags = new ArrayList();
	
	
	
	
	
	public Post() {
	
	}
	public Post(long id, String content, String description, Date posted_At, String title, List<Tag> tags) {
		super();
		this.id = id;
		this.content = content;
		this.description = description;
		this.posted_At = posted_At;
		this.title = title;
		this.tags = tags;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getPosted_At() {
		return posted_At;
	}
	public void setPosted_At(Date posted_At) {
		this.posted_At = posted_At;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Tag> getTags() {
		return tags;
	}
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	} 
	
	
	

}
