package com.spring.jdbc;

public class Customer {
	
	private long custId;
	private String name;
	private long age;
	
	public Customer(){
		
	}
	public Customer(int custId,String name,int age){
		this.custId = custId;
		this.name = name;
		this.age = age;
	}
	
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	
	@Override
	public String toString(){
		return "\n[CustID : "+custId+" Name : "+name+" Age : "+age+"]";
	}
}
