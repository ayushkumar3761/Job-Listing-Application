package com.ayush.Joblisting.Repository;

import java.util.List;

import com.ayush.Joblisting.model.Post;

public interface SearchRepository 
{
	List<Post> findByText(String text);
	
}
