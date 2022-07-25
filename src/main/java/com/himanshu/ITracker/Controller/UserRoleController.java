package com.mayank.ITracker.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mayank.ITracker.Entity.UserRole;
import com.mayank.ITracker.Service.UserRoleService;

@RestController
@CrossOrigin(origins = "http://localhost:4200",maxAge=3600)
public class UserRoleController {



	@Autowired
	private UserRoleService userRoleService;
	
	@GetMapping("/homes")
	public String home() {
		return "Welcome from user Role tables";
	}
	
//	@PostMapping("/userRole")
//	public UserRole addUserRole(@RequestBody UserRole userRole) {
//		return userRoleService.addUserRole(userRole);
//	}
	
	@GetMapping("/userRole")
	public List<UserRole> getAllUserRole(){
	   return this.userRoleService.getAllUserRole();
	}
}
