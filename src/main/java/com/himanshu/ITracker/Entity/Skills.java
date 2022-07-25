package com.mayank.ITracker.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
@IdClass(SkillsPK.class)
public class Skills {
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@Id
	@JoinColumn(name="id")
	private UserRole userRole;
	
	@Id
	@Column(length = 30)
	public String skill;
	
	public int round;

	

	public Skills() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Skills(UserRole userRole, String skill, int round) {
		super();
		this.userRole = userRole;
		this.skill = skill;
		this.round = round;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}
	
}
