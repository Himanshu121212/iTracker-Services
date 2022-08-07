package com.himanshu.ITracker.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.himanshu.ITracker.Dao.SkillDao;
import com.himanshu.ITracker.Entity.Skills;
import com.himanshu.ITracker.Entity.SkillsPK;


@Service
public class SkillsServiceImpl implements SkillsService {

	@Autowired
	private SkillDao skillDao;
	
	public Skills saveSkills(Skills S) {
		
		return skillDao.save(S);
		}
	
	

	public List<Skills> getSkills(String skillString) {
		return this.skillDao.getinterviewerId(skillString);
	}
	
//	public Optional<Skills> getSkills(int id, String skill) {
//		SkillsPK pk=new SkillsPK(skill,id);
//		return this.skillDao.findById(pk);
//	}
	
   @Override
   public List<Skills> getSkills(Long sid) {
	   return this.skillDao.getSkills(sid);
    }



@Override
public void delet(int id) {
	skillDao.getSkillsdel(id);
	
}



   
   
   

//	@Override
//	public Skills updateSlot(Skills skills, int id, String skillString) {
//		SkillsPK pk=new SkillsPK(skillString,id);
//		Optional<Skills> skill=skillDao.findById(pk);
//		Skills sk= skill.get();
//		sk.setSkill(skills.getSkill());
//		sk.setRound(skills.getRound());
//		return skillDao.save(sk);
//	}

	
	
}
