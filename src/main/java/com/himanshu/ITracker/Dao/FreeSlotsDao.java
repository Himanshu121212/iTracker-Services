package com.mayank.ITracker.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mayank.ITracker.Entity.FreeSlots;
@Repository("FreeSlotsrepo")
public interface FreeSlotsDao extends JpaRepository<FreeSlots,Integer>{

}
