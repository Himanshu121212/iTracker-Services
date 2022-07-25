package com.mayank.ITracker.Entity;

import java.io.Serializable;
import java.util.Objects;

public class SkillsPK implements Serializable{

	private static final long serialVersionUID = 1L;
	private String skill;
	private Long userRole;
	
	
	public SkillsPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public SkillsPK(String skill, long userRole) {
		super();
		this.skill = skill;
		this.userRole = userRole;
	}



	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public long getUserRole() {
		return userRole;
	}
	public void setUserRole(Long userRole) {
		this.userRole = userRole;
	}



	@Override
	public int hashCode() {
		return Objects.hash(skill, userRole);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SkillsPK other = (SkillsPK) obj;
		return Objects.equals(skill, other.skill) && userRole == other.userRole;
	}
	
	
	
}
