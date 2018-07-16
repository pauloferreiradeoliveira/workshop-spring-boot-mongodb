package com.paulo.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.paulo.workshopmongo.domain.User;

@Repository
public interface UseRepository extends MongoRepository<User, String> {

}
