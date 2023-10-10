package com.project.parking.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.parking.Model.Customer;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Integer>{
	
	public Customer findByEmail(String email);
}

