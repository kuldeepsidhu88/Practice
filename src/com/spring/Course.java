package com.spring;

public class Course {

	private String name;
	private String code;
	
	public Course(){
		
	}
	public Course(String code,String name){
		this.code = code;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	@Override
	public String toString(){
		return "Name:"+name+" | Code:"+code;
	} 
	
	
}
