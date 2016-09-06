package com.testng.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {
	private String message = "Hello Thaj how r u1111";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testPrintMessage(){
		System.out.println("Inside print message");
		Assert.assertEquals(message, messageUtil.printMessage());
		
	}
	
	
	

}
