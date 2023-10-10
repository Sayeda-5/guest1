package com.project.parking.Exception;

public class SpaceNotFoundException extends Exception{

	public SpaceNotFoundException(String message) {
		super(message);
		
	}
	 
	public String toString() {
		return getMessage();
	}
	
}