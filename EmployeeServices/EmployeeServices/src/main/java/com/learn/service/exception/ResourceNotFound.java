package com.learn.service.exception;

public class ResourceNotFound extends RuntimeException{

	public ResourceNotFound() {
		super("Resorce Not Found");
	}
	
	public ResourceNotFound(String message) {
		super(message);
	}
	
}
