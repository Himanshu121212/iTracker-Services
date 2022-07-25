package com.mayank.ITracker.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mayank.ITracker.Entity.Turbohire;

@Repository
public interface TurbohireDao extends JpaRepository<Turbohire,String>{

}
