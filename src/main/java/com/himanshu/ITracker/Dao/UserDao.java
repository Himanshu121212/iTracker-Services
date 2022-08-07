package com.himanshu.ITracker.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.himanshu.ITracker.Entity.User;

public interface UserDao extends JpaRepository<User,Long>{

	public User getByEmail(String email);
	
}
