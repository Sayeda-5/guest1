package com.project.parking.Exception;

public class CustomerException extends Exception{

	public CustomerException(String message) {
		super(message);
		
	}
	 
	public String toString() {
		return getMessage();
	}
	
}

