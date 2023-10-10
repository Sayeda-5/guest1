package com.project.parking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.parking.Model.Session;
import com.project.parking.Model.UserType;



@Repository
public interface SessionDAO extends JpaRepository<Session, Integer>{

	public Session findByUserIdAndUserType(Integer userId, UserType userType);
	
	public Session findBySessionKey(String sessionKey);
}
