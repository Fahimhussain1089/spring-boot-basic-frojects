package com.codewithdurgesh.blog.services;

import java.util.List;

import com.codewithdurgesh.blog.payloads.PostDto;
import com.codewithdurgesh.blog.payloads.PostResponse;

public interface PostService {
	
	//create [post
	PostDto createPost(PostDto postDto ,Integer userId,Integer categerId);
	
	
	//update post
	PostDto updatePost(PostDto postDto,Integer postId);
	
	//delete post
	void deletePost(Integer postId);
	
	//getAll post
	PostResponse getAllPost(Integer pageNumber, Integer pageSize,String sortBy,String sortDir);
	
	//getsingle post
	PostDto getPostById(Integer postId);
	
	
	//get all post by category
	List<PostDto> getPostsByCategory(Integer catgoryId);
	
	//get all posts by user
	List<PostDto> getPostsByUser(Integer userId);
	
	//search posts
	List<PostDto> searchPosts(String keyword);
	
	
	
	
}
