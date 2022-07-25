package com.mayank.ITracker.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayank.ITracker.Dao.UserRoleDao;
import com.mayank.ITracker.Entity.UserRole;

@Service
public class UserRoleServiceImpl implements UserRoleService {

	@Autowired
	private UserRoleDao userRoleDao;
	
	@Override
	public UserRole addUserRole(UserRole userRole) {
		return userRoleDao.save(userRole);
	}

	@Override
	public List<UserRole> getAllUserRole() {
		
		return userRoleDao.findAll();
	}

	
}
