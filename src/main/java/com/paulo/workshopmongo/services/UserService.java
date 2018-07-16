package com.paulo.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paulo.workshopmongo.domain.User;
import com.paulo.workshopmongo.repository.UseRepository;

@Service
public class UserService {

	@Autowired
	private UseRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
}
