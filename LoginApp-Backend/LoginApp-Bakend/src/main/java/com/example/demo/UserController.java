package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:5173") // Allow React
public class UserController {
	
	@Autowired
	UserService userServ;
	
	@PostMapping("/login")
	public Object login(@RequestBody LoginRequest loginRequest) {
		
		 User user = userServ.login(loginRequest.username, loginRequest.password);
		
		if(user != null) {
			return new LoginResponse(user.getUsername(), user.getSalary());
		} 
		return new ErrorResponse("Inavild username or password");
	}
	
	class LoginResponse {
		public String username;
		public int salary;
		
		public LoginResponse(String username, int salary) {
			this.username = username;
			this.salary = salary;
		}
	}
	
	class ErrorResponse {
		public String message;
		
		public ErrorResponse(String message) {
			this.message = message;
		}
	}
}
