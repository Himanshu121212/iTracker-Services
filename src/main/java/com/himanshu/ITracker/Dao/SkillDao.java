package com.mayank.ITracker.Dao;


import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mayank.ITracker.Entity.Skills;
import com.mayank.ITracker.Entity.SkillsPK;
@Repository
@Transactional
public interface SkillDao extends JpaRepository<Skills, SkillsPK>{
	@Query(value="Select * from skills s where s.skill=:sk", nativeQuery=true) 
	public List<Skills> getinterviewerId(@Param("sk") String sk);
	
	@Query(value="Select * from skills s where s.id=:sid", nativeQuery=true) 
	public List<Skills> getSkills(@Param("sid") Long sid);
    
	@Modifying
	@Query(value=" DELETE FROM skills s WHERE s.id = :round ", nativeQuery=true) 
	public void  getSkillsdel(@Param("round") int round);
	
	

	
	

}
