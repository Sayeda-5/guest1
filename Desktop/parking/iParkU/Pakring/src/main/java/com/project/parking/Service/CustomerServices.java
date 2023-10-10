package com.project.parking.Service;

import java.util.List;

import com.project.parking.Exception.CustomerException;
import com.project.parking.Model.Customer;

public interface CustomerServices {
	
	public Customer addCustomer(Customer customer) throws CustomerException;
	
	public Customer updateCustomer(Customer customer) throws CustomerException;
	
	public Customer deleteCustomer(Integer customerId) throws CustomerException;
	
	public Customer viewCustomer(Integer customerId) throws CustomerException;
	
	public List<Customer> viewAllCustomer() throws CustomerException;
	
}