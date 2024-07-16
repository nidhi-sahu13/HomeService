package com.jsp.HomeServeO.util;

import lombok.Data;

@Data
public class ResponseStructure<T> {
	
	private String message;
	private int status;
	private T data; 

	//extra member local date time
	//LocalDateTime 
	//localdatetime t=LocalDateTime.now();
	//java mail sender
}
