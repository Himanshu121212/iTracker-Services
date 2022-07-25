
package com.mayank.ITracker.Service;

import java.util.List;

import com.mayank.ITracker.Entity.UserRole;

public interface UserRoleService {


	public UserRole addUserRole(UserRole userRole);

	public List<UserRole> getAllUserRole();

}
