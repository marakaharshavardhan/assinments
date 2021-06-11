package com.jspider.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.springmvc.dto.User;
import com.jspider.springmvc.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public void saveUser(User user) {
		repository.saveUser(user);
	}
	
	public List<User> getUsers() {
		return repository.getUsers();
	}
}
