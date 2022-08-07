package com.himanshu.ITracker.Service;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.himanshu.ITracker.Controller.FreeSlotsController;
import com.himanshu.ITracker.Dao.SlotsBookDao;
import com.himanshu.ITracker.Dao.SlotsDao;
import com.himanshu.ITracker.Dao.UserDao;
import com.himanshu.ITracker.Entity.Slots;
import com.himanshu.ITracker.Entity.SlotsBook;

@Service
public class SlotsBookServiceImpl implements SlotsBookService {

	@Autowired
	private SlotsBookDao slotsBookDao;
	
	@Autowired
	private SlotsDao slotsDao;
	
	@Autowired
	private FreeSlotsController freeslotscontroller;
	
	@Autowired
	private UserDao userDao;
	public SlotsBookServiceImpl(SlotsBookDao slotsBookDao) {
		super();
		this.slotsBookDao = slotsBookDao;
	}

	@Override
	public SlotsBook saveSlots(int slot_id,int i_id,String cname,int r_id) {
		
		// i_id = time / data -> slots Table status
		// i_name = user/id users table
		SlotsBook sb = new SlotsBook();
		
		sb.setCandidate_name(cname);
		
	Slots listslots = this.slotsDao.getslotsByfs_fk(slot_id);
	Slots slots = this.freeslotscontroller.updatestatus(slot_id);
	// Data fill in object
	sb.setR_id(r_id);
	sb.setI_id(i_id);
	
		return slotsBookDao.save(sb);
		
		
	}

	@Override
	public List<SlotsBook> getAllSlots() {
		return slotsBookDao.findAll();
	}

//	@Override
//	public SlotsBook getSlotsById(int i_id) {
//		Optional<SlotsBook> slotBook=slotsBookDao.findById(i_id);
//		return slotBook.get();
//	}

	@Override
	public SlotsBook updateSlot(SlotsBook slotssBook, int slot_b_id) {
		Optional<SlotsBook> slotBook=slotsBookDao.findById(slot_b_id);
		SlotsBook slotsBook= slotBook.get();
		slotsBook.setI_id(slotssBook.getI_id());
//		slotsBook.setRound(slotssBook.getRound());
		slotsBook.setCandidate_name(slotssBook.getCandidate_name());
		//save existing recruiter
		slotsBookDao.save(slotsBook);
		return slotsBook;
	}

	@Override
	public void deleteSlot(int slot_b_id) {
		slotsBookDao.deleteById(slot_b_id);	
	}
}
