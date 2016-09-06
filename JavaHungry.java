package com.testng.test;

public class JavaHungry {


	
	public static void main (String[] args )
	{
		String s1 = "abc";
		String s2 = s1;
	s1+="d";

	System.out.println(s1+" "+s2 + " " +(s1==s2));
	
	StringBuffer sb1 = new StringBuffer("abc");
	StringBuffer sb2 = sb1;
	sb1.append("d");
	
	System.out.println(sb1+" "+sb2 + " "+(sb1==sb2) );
	
	StringBuffer demo1 = new StringBuffer("Hello") ;
	// The above object stored in heap and its value can be changed .
	//demo1=new StringBuffer("Bye");
	
	System.out.println(demo1 );
	String  demo = " hello " ;
	//demo="Bye" ; 
	System.out.println(demo );
	
}
}
