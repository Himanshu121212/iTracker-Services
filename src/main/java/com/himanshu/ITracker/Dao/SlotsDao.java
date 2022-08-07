package com.himanshu.ITracker.Dao;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.himanshu.ITracker.Entity.Slots;

@Repository
public interface SlotsDao extends JpaRepository<Slots, Integer>{
	
	
	@Query(value="Select s.slot_id,s.date,s.time,s.status from slots s where s.slot_id=:fs_fk", nativeQuery=true) 
	public Slots getslotsByfs_fk(@Param("fs_fk") int fs_fk);
	
	
	@Query(value="Select s.slot_id,s.date,s.time,s.status from slots s where s.fs_fk=:fs_fk", nativeQuery=true) 
	public List<Slots> getslotsByAll_fk(@Param("fs_fk") int fs_fk);
	
	@Query(value="Select s.slot_id,s.date,s.time,s.status from slots s where s.fs_fk=:fs_fk AND status=0", nativeQuery=true) 
	public List<Slots> getbookslots(@Param("fs_fk") int fs_fk);
	
	@Query(value="Select s.slot_id,s.date,s.time,s.status from slots s where s.slot_id=:slot_id", nativeQuery=true) 
	public Slots findBySlot_Id(@Param("slot_id")int slot_id);
}
