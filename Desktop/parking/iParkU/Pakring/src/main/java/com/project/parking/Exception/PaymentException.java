package com.project.parking.Exception;

public class PaymentException extends Exception{

	public PaymentException(String message) {
		super(message);
		
	}
	 
	public String toString() {
		return getMessage();
	}
	
}



