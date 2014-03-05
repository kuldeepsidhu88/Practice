package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String args[])
	{
		/*String ss1=new String("ABC");
		String ss2=new String("ABC");
		String s1="ABC";
		String s2="ABC";
		System.out.println(" == comparison for StringObjects: " + (ss1==ss2));
		System.out.println(" == comparison for StringLiterals: " + (s1==s2));
		System.out.println(" equals( ) comparison for StringObjects: " + (ss1.equals(ss2)));
		System.out.println(" equals( ) comparison for StringLiterals: " + (s1.equals(s2)));
		
		System.out.println(" equals( ) comparison for StringLiterals: " + (ss1==(s1)));
		System.out.println(" equals( ) comparison for StringLiterals: " + (ss1.equals(s1)));*/
			
		
		StringBuffer sb = new StringBuffer("Hello");
		print(sb);
		System.out.println(sb);
	
	// Part I – primitive data types
	/*int i = 25;
	System.out.println(i); // print it (1)
	iMethod(i);
	System.out.println(i); // print it (3)
	 System.out.println("—————–");
	
	 // Part II – objects and object references
	 StringBuffer sb = new StringBuffer("Hello, world");
	 System.out.println(sb); // print it (4)
	 sbMethod(sb);
	 System.out.println(sb); // print it (6)
	 System.out.println("—————–");
	 
	 // Part III – strings
	 String s = "Java is fun!";
	 System.out.println(s); // print it (7)
	 sMethod(s);
	 System.out.println(s); // print it (9)
	 }
	
	 public static void iMethod(int iTest)
	 {
	 iTest = 9; // change it
	 System.out.println(iTest); // print it (2)
	 }
	
	 public static void sbMethod(StringBuffer sbTest)
	 {
	 sbTest = sbTest.insert(7, "Java "); // change it
	 System.out.println(sbTest); // print it (5)
	 }
	
	 public static void sMethod(String sTest)
	 {
	 sTest = sTest.substring(8, 11); // change it
	 System.out.println(sTest); // print it (8)	
	*/
	}
	public static void print(StringBuffer sba ){
		sba.append(" World!");
	}

}