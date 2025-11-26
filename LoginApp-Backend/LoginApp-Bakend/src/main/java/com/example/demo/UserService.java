package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public User login(String username, String password) {
		return userRepo.findByUsernameAndPassword(username, password);
	}
	
}
