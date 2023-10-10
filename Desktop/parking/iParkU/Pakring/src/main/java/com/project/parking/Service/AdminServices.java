package com.project.parking.Service;

import com.project.parking.Exception.AdminException;
import com.project.parking.Model.Admin;

public interface AdminServices {

	public Admin addAdmin(Admin admin) throws AdminException;
	
	public Admin getAdminById(Integer adminID)throws AdminException;
	
	public Admin deleteAdminById(Integer adminID)throws AdminException;
	
	public Admin updateAdmin(Admin admin)throws AdminException;
	
	
}
