package com.himanshu.ITracker.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.himanshu.ITracker.Entity.SlotsBook;

public interface SlotsBookDao extends JpaRepository<SlotsBook, Integer> {

	@Query(value="Select * from slots_book s where s.i_id=:i_id", nativeQuery=true) 
	public List<SlotsBook> getslotsByI_id(@Param("i_id") int i_id);
	
}
