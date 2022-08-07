package com.himanshu.ITracker.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.himanshu.ITracker.Dao.SkillDao;
import com.himanshu.ITracker.Entity.Skills;
import com.himanshu.ITracker.Entity.Slots;
import com.himanshu.ITracker.Service.SkillsService;

@RestController
@CrossOrigin(origins = "http://localhost:4200",maxAge=3600)
public class SkillsController {
@Autowired
private SkillsService skillsService;
private SkillDao sk;
	
	@PostMapping("/skills")
	public ResponseEntity<Skills> addSkill(@RequestBody Skills skills)
	{
		
		System.out.println(skills);
		Skills s=this.skillsService.saveSkills(skills);
	 	if(s == null) {
	 		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	 	}else {
	 		return ResponseEntity.of(Optional.of(skills));
	}
	 	}
	@GetMapping("/skills")
	public ResponseEntity<List<Skills>> getSkill(@RequestParam("id") Long id)
	{
		List<Skills> list=this.skillsService.getSkills(id);
		if(list.size()<=0)
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		return ResponseEntity.of(Optional.of(list));
	}
	
	@GetMapping("/skills/")
	public ResponseEntity<List<Skills>> getSkill(@RequestParam("skill") String skillString)
	{
		List<Skills> list=this.skillsService.getSkills(skillString);
		if(list.size()<=0)
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		return ResponseEntity.of(Optional.of(list));
	}
	
//	@PutMapping("/skills")
//	public ResponseEntity<Skills> updateskill(@RequestParam("id") int id,@RequestParam("skill")  String skillString,@RequestBody Skills skills){
//		return new ResponseEntity<Skills>(skillsService.updateSlot(skills,id,skillString), HttpStatus.OK);
//	}
	
	//@DeleteMapping("/skillsdel")
	//public void deletePost() {
		//skillsService.deleteSlot(new Long(1));
		
	
	//}
	@RequestMapping(value="him",method=RequestMethod.DELETE)
	@ResponseBody
	public void deleing(@RequestParam("sid") int sid)
	{
		skillsService.delet(2);
		
	 
	}
}

