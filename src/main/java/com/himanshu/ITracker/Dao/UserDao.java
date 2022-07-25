package com.mayank.ITracker.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mayank.ITracker.Entity.User;

public interface UserDao extends JpaRepository<User,Long>{

	public User getByEmail(String email);
	
}
