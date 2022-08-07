package com.himanshu.ITracker.Service;

import java.util.List;

import com.himanshu.ITracker.Entity.Skills;

public interface SkillsService {

    public Skills saveSkills(Skills S);
	public List<Skills> getSkills(Long id);
	public List<Skills> getSkills(String skString);
	public void delet(int sid);
//	public Skills updateSlot(Skills skills,int id, String skillString);
	
}
