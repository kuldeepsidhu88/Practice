package com.spring;

import java.util.List;
import java.util.Map;

public class Student {

	private String name;
	private int empId;
	private Address address;
	private List<Course> courseList;
	private Map<Course, Marks> marks;
	
	
	public Map<Course, Marks> getMarks() {
		return marks;
	}
	public void setMarks(Map<Course, Marks> marks) {
		this.marks = marks;
	}
	public Student(int id){
		this.empId = id;
	}
	public Student(String name){
		this.name = name;
	}
	public Student(){
		
	}
	public Student(int id,String name){
		this.empId = id;
		this.name = name;
	}
	public Student(String name,int id){
		this.empId = id+1000000;
		this.name = name+"Second";
	}
	public Student(String name,int id,Address add){
		this.empId = id;
		this.name = name;
		this.address = add;
	}
	public Student(String name,int id,Address add,List<Course> courseList){
		this.empId = id;
		this.name = name;
		this.address = add;
		this.courseList = courseList;
	}
	public Student(String name,int id,Address add,List<Course> courseList,Map<Course, Marks> marks){
		this.empId = id;
		this.name = name;
		this.address = add;
		this.courseList = courseList;
		this.marks = marks;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void showData(){
		//System.out.println("-----------------");
		System.out.println("Id : "+empId);
		System.out.println("Name : "+name);
		/*System.out.println("Address : "+address);
		System.out.println("Course List  : "+courseList);
		System.out.println("Marks : "+marks);
		System.out.println("-----------------");*/
	}
	
	public void showAddress(){
		System.out.println("Address : "+address);
	}
	public void showGrades(){
		System.out.println("Course List : "+courseList);
		System.out.println("Marks : "+marks);
	}
	
	public void showException(String ex){
		System.out.println("Show Exception Start : "+ex);
		throw new IllegalArgumentException("Exception from Student class");
	}
}
