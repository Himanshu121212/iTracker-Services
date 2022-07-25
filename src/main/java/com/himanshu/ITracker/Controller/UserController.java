package com.mayank.ITracker.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.mayank.ITracker.Entity.User;
import com.mayank.ITracker.Service.UserService;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@CrossOrigin(origins = "http://localhost:4200",maxAge=3600)
public class UserController {


	@Autowired   
	private UserService userService;
	
	// This Method will add data inside the user Table 
	// API: localhost:8080/users
	
	
	@PostMapping("/users")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		System.out.println(user);
			ResponseEntity<User> u = this.userService.addUser(user);
		 	if(u == null) {
		 		return ResponseEntity.status(HttpStatus.ALREADY_REPORTED).build();
		 	}else {
		 		return ResponseEntity.of(Optional.of(user));
		 		
		 	}
	}
	
	// This Method will fetch all the records from the user table
	// API: localhost:8080/users
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getUsers(){
		List<User> list = this.userService.getUsers();
		if(list.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}
	
	
	// This Method will fetch only one record from the user table based on the email Id.
	// API: localhost:8080/users/{email} 
	
	
	@GetMapping("/users/{email}")
	public ResponseEntity<User> getUser(@PathVariable String email) {
		User user = this.userService.getUser(email);
		if(user == null ) {
			
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(user)); 
	}
	
	
	
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUserById(@PathVariable long id ) {
		User user = this.userService.getUserById(id);
		if(user == null ) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(user)); 
		
	}

	@GetMapping("users/role")
	public List<User> getUserByRole(@RequestParam("role") String role){
		return this.userService.getUserByRole(role);
		
	}
	
}
