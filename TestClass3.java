package com.testng.test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
public class TestClass3 {

	  @BeforeTest
	  
	  	    public void doBeforeTest() {
	  
	  	        System.out.println("testClass3: before test");
	  
	  	    }
	 
	  	     
	  
	  	    @Test
	  
	  	    public void scenario2() {
	  
	  	        System.out.println("testClass3: scenario2");
	  
	  	    }
	  
	  	     
	  
	  	    @AfterSuite
	  
	  	    public void doAfterSuite() {
	  
	  	        System.out.println("testClass3: after suite");
	  
	  	    }
}
