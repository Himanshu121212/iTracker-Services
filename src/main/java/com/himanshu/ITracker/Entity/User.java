package com.himanshu.ITracker.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class User {
	
//	@Column(name="user_name")
	private String name;

	@Id
	public String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="userId")
	private UserRole userRole;
	
//	@JsonProperty(access = Access.WRITE_ONLY)
//	private String password;
	
	private String gender;
	private String location;
	private String contactNo;
	private int exp;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", userRole=" + userRole + ", gender=" + gender
				+ ", location=" + location + ", contactNo=" + contactNo + ", exp=" + exp + "]";
	}



	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public UserRole getUserRole() {
		return userRole;
	}
	public void setuserRole(UserRole userRole) {
		this.userRole = userRole;
	}
	
	
	
}
