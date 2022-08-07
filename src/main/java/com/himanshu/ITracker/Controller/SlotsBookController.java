package com.himanshu.ITracker.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.himanshu.ITracker.Dao.SlotsBookDao;
import com.himanshu.ITracker.Entity.SlotsBook;
import com.himanshu.ITracker.Service.SlotsBookService;

@RestController
@RequestMapping("/slotsBook")
@CrossOrigin(origins = "http://localhost:4200",maxAge=3600)
public class SlotsBookController {
	
	@Autowired
	private SlotsBookDao sbd;
	private SlotsBookService slotsBookService;

	public SlotsBookController(SlotsBookService slotsBookService) {
		super();
		this.slotsBookService = slotsBookService;
	}
	
	//REST API to add data in the slot book table
	@PostMapping("/")
	public ResponseEntity <SlotsBook> saveSlots(@RequestParam("slot_id") int slot_id,@RequestParam("i_id") int i_id,@RequestParam("cname") String cname,@RequestParam("r_id") int r_id){
		return new ResponseEntity<SlotsBook>(slotsBookService.saveSlots(slot_id,i_id,cname,r_id), HttpStatus.OK);

	}
	
	//REST API to view all slots
	@GetMapping
	public List<SlotsBook> getAllSlots(){
		return slotsBookService.getAllSlots();
	}
	
	//REST API to get a particular slot by recruiter's id
//	@GetMapping("{id}")
//	public ResponseEntity<SlotsBook> getRecruiterById(@PathVariable("id") int slotsId){
//		return new ResponseEntity<SlotsBook>(slotsBookService.getSlotsById(slotsId), HttpStatus.OK);
//	}
	
	//REST API to update slots
	@PutMapping("{id}")
	public ResponseEntity<SlotsBook> updateRecruiter(@PathVariable("id") int slot_b_id,@RequestBody SlotsBook slotsBook){
		return new ResponseEntity<SlotsBook>(slotsBookService.updateSlot(slotsBook, slot_b_id), HttpStatus.OK);
	}
	
	//REST API to delete a particular slot
		@DeleteMapping("{id}")
		public ResponseEntity<String> deleteSlot(@PathVariable("id") int slot_b_id){
			slotsBookService.deleteSlot(slot_b_id);
			return  new ResponseEntity<String>("Deleted",HttpStatus.OK);
		}
		
		
		@RequestMapping(value="booked",method=RequestMethod.GET)
		public List<SlotsBook> get(@RequestParam("i_id") int i_id)
		{
			System.out.println(i_id);
			return (sbd.getslotsByI_id(i_id));

		}
}
