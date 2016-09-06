package com.testng.test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {
	@BeforeSuite	
		    public void doBeforeSuite() {	
		        System.out.println("testClass1: before suite");	
		    }     
	
	   @BeforeTest	   
	   	    public void doBeforeTest() {	   
	   	        System.out.println("testClass1: before test");	   
	   	    }
	   	   	     	   
	   	    @Test	   
	   	    public void unitLevel1() {	   
	   	        System.out.println("testClass1: Unit level1 testing");
	   	   	    }
}
