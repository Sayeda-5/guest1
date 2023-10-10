package com.project.parking.Service;

import com.project.parking.Exception.LoginException;
import com.project.parking.Model.LoginDTO;
import com.project.parking.Model.Session;
import com.project.parking.Model.UserType;

public interface LoginService {
	public Session login(LoginDTO loginDto) throws LoginException;
	
	public String logout(Integer userId, UserType userType)throws LoginException;
}
