package com.himanshu.ITracker.Service;

import java.util.List;

import com.himanshu.ITracker.Entity.SlotsBook;

public interface SlotsBookService {

	SlotsBook saveSlots(int slot_id,int i_id, String c_name, int r_id);
	List<SlotsBook> getAllSlots();
//	SlotsBook getSlotsById(int i_id);
	SlotsBook updateSlot(SlotsBook slotsBook, int slot_b_id);
	void deleteSlot(int slot_b_id);
	
}
