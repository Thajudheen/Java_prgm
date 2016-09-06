package com.testng.test;

import org.testng.Assert;
import org.testng.annotations.Test;
public class SampleTest2 {
	 String message = "Hello Thaj how r u1111";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test
	public void testSalutationMessage(){
		System.out.println("Inside Salutation message");
		message = "hi"+"Hello Thaj how r u1111";
		Assert.assertEquals(message, messageUtil.salutationMessage());
	}

}
