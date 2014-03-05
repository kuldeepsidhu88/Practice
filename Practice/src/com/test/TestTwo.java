package com.test;


public class TestTwo {

	public static void main(String[] args) {
		
	A a = new B(); 
	System.out.println(a.getClass().getMethods().toString());
	a.print(1);
		
	}
	
}

class A {
	public Object print(long o){
		System.out.println("A");
		return null;
	}
	
}

class B extends A {

	public String print(long o){
		System.out.println("B");
		return null;
	}
	
}

