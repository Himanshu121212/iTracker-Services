package com.himanshu.ITracker.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.himanshu.ITracker.Dao.UserDao;
import com.himanshu.ITracker.Entity.User;


@Service
public class UserServiceImpl implements UserService{


	@Autowired
	private UserDao userDao;
	
	
	public List<User> getUsers() {
		return this.userDao.findAll();
		
	}

	public ResponseEntity<User> addUser(User user) {
		   
		
		
		User u = this.userDao.getByEmail(user.email); 
		// For checking this email is already there or not.  **Unique Email
		if(u != null) {    // if it is there directly return null
			return null;
		}else {
//				user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));
			 this.userDao.save(user);    // email is not there so store the data
			 return ResponseEntity.of(Optional.of(user)); 
		}
	}
	public User getUser(String email) {
		User user = null;
		try {
			user = this.userDao.getByEmail(email);
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		
		
		
		 return user;
	}

	@Override
	public User getUserById(long id) {
		// TODO Auto-generated method stub
		User u = null;
		try {
//			u = this.userDao.findById(id).get();
			List<User> users = this.userDao.findAll();
			for(int i = 0;i<users.size();i++) {
				if(users.get(i).getUserRole().getUserId() == id) {
					u = users.get(i);
				}
			}
		}catch(NoSuchElementException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		return u;
	}

	public List<User> getUserByRole(String role) {
		// TODO Auto-generated method stub
		List<User> users = this.userDao.findAll();

		List<User> filterUser= new ArrayList<>();
//		String rolee = "Interviewer";
		for(int i = 0;i<users.size();i++) {
			 if(role.equals(users.get(i).getUserRole().getRole())) {
				 filterUser.add(users.get(i));
				
			}
		}
	
	
		return filterUser;
	}
	
}
