package com.org.exception;

public class RouteNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public RouteNotFoundException(String msg) {
		super(msg);
	}

}
