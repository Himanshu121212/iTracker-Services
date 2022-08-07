package com.himanshu.ITracker.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.himanshu.ITracker.Dao.FreeSlotsDao;
import com.himanshu.ITracker.Entity.FreeSlots;


@Service("FreeSlotsService")
public class FreeSlotsServiceImpl implements FreeSlotsService {

	@Autowired
	private FreeSlotsDao freeslotdao;

	

	@Override
	public FreeSlots save(FreeSlots s) {
		// TODO Auto-generated method stub
		return freeslotdao.save(s);
	}
	
	
}


