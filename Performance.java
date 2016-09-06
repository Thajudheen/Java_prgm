package com.testng.test;

	import java.util.*;
	public class Performance {
	    public static void main(String[] args){
	        Vector v=new Vector();
	        Object element;
	      //  Enumeration enum;
	        Iterator iter;
	        long start;
	        
	      
	        
	        for(int i=0; i<1000000; i++){
	            v.add("New Element");
	            v.add("thaj");
	        }
	        
	       // enum=v.elements();
	        iter=v.iterator();
	        //*****CODE BLOCK FOR ITERATOR**********************
	        start=System.currentTimeMillis();
	        while(iter.hasNext()){
	            element=iter.next();
	        }
	        System.out.println("Iterator took " + (System.currentTimeMillis()-start));

   }
}