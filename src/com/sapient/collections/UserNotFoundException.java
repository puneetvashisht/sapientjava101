package com.sapient.collections;

public class UserNotFoundException extends Exception{
	
	UserNotFoundException(){
		
	}
	
	UserNotFoundException(String message){
		super(message);
	}
	
}
