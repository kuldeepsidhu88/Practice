package com.test;


public class TestTwo {

	public static void main(String[] args) {
		
		TestTwo tt = new TestTwo();
		tt.add("hello", "world");
		System.out.println("**********"); 
		tt.add("hello");
		System.out.println("**********");
		tt.add("hello", "world",null);
		
		
		Employee emp = new Employee("12", "Deep");
		System.out.println(emp);
		

	}
	
	public void add(String ... args){
		
		for(String arg: args) {
	            System.out.print(" " + arg);
	        }
	}
	public void add(String a,String b){
		System.out.println(a+" / "+b);
	}
	
	static void f(float i, Character... args) {
        System.out.println("first");
        System.out.println(i);
    }
    static void f(Character... args) {
        System.out.println("second");
    }
}

class Employee{
	String name;
	String id;
	
	public Employee(String id,String name){
		this();
		this.id=id;
		this.name=name;
	}
	public Employee(){
		System.out.println("Default");
	}
	public String toString(){
		return id + " " + name;
	}
}
