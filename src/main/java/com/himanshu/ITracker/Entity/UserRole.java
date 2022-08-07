package com.himanshu.ITracker.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class UserRole {

	@Id
	private Long userId;
	
	@Override
	public String toString() {
		return "UserRole [userId=" + userId + ", role=" + role + "]";
	}
	public UserRole() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserRole(Long userId, String role) {
		super();
		this.userId = userId;
		this.role = role;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	private String role;
	
	
}
