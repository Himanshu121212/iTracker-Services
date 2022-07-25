package com.mayank.ITracker.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mayank.ITracker.Entity.User;

public interface UserService {


	public List<User> getUsers();

	public ResponseEntity<User> addUser(User user);

	public User getUser(String email);

	public User getUserById(long id);

//	public List<User> getUserByRole(String role);
	public List<User> getUserByRole(String role);
}
