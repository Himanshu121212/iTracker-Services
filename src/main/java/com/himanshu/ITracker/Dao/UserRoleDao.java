package com.mayank.ITracker.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mayank.ITracker.Entity.UserRole;

public interface UserRoleDao extends JpaRepository<UserRole,Long> {

	

}

