package com.himanshu.ITracker.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.himanshu.ITracker.Entity.Turbohire;

@Repository
public interface TurbohireDao extends JpaRepository<Turbohire,String>{

}
