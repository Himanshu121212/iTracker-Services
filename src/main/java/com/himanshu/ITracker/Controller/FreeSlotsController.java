package com.mayank.ITracker.Controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mayank.ITracker.Dao.FreeSlotsDao;
import com.mayank.ITracker.Dao.SlotsDao;
import com.mayank.ITracker.Entity.FreeSlots;
import com.mayank.ITracker.Entity.Slots;
import com.mayank.ITracker.Service.FreeSlotsService;

@RestController
@RequestMapping("User/Interview")
@CrossOrigin(origins = "http://localhost:4200",maxAge=3600)
public class FreeSlotsController {
	@Autowired
     private FreeSlotsService freeslotsservice;	
	
	@Autowired
	private SlotsDao sd;
	
@RequestMapping(value="create",method=RequestMethod.POST)

	public ResponseEntity<FreeSlots> create(@RequestBody FreeSlots s)
	{
	try {
		
		return new ResponseEntity<FreeSlots>(freeslotsservice.save(s),HttpStatus.OK);
	}
	catch(Exception e)
	{
		return new ResponseEntity<FreeSlots>(HttpStatus.BAD_REQUEST);
		
	}
	}

	@RequestMapping(value="free",method=RequestMethod.GET)
	public Slots get(@RequestParam("fs_fk") int fs_fk)
	{

		return (sd.getslotsByfs_fk(fs_fk));
	
	}

	@RequestMapping(value="all",method=RequestMethod.GET)
	public List<Slots> getByAll(@RequestParam("i_id") int i_id)
	{
		
		return (sd.getslotsByAll_fk(i_id));
	
	}
	
	@RequestMapping(value="booked",method=RequestMethod.GET)
	public List<Slots> getbook(@RequestParam("i_id") int i_id)
	{
		
		return (sd.getbookslots(i_id));
	
	}
	
	@RequestMapping(value="statuschange",method=RequestMethod.PUT)
	public Slots updatestatus(@RequestParam("slot_id") int slot_id)
	{
		
	  Slots s=sd.findBySlot_Id(slot_id);
	  
	  s.setStatus(0);
	  sd.save(s);
	  
	  return s;
	}



}