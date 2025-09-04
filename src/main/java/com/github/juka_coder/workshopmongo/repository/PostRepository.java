package com.github.juka_coder.workshopmongo.repository;

import com.github.juka_coder.workshopmongo.domain.Post;
import com.github.juka_coder.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {


}
