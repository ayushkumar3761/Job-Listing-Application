package com.ayush.Joblisting.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ayush.Joblisting.model.Post;

public interface PostRepository extends  MongoRepository<Post,String>
{
	
}
