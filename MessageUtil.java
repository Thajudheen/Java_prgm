package com.testng.test;

public class MessageUtil {
	 String message;
	public  MessageUtil(String message) {
		this.message=message;
		
	}
	public String printMessage(){
		System.out.println(message);
		return message;
	}
	public String salutationMessage(){
		message = "hi"+ message;
		System.out.println(message);
		return message;
	}

}
