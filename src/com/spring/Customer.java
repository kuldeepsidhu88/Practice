package com.spring;

public class Customer {

	public String showCustomerDetails(){
		System.out.println("Inside showCustomerDetails");
		return "Kuldeep";
	}
	
	public void addCustomer(){
		System.out.println("Inside addCustomer");
	}
	
	public void deleteCustomer(){
		System.out.println("Inside deleteCustomer");
	}
	
	public void updateCustomer(){
		System.out.println("Inside updateCustomer");
		throw new IllegalStateException("Update Customer Failed");
	}
	
	public void showCustomerPin(int custId){
		System.out.println("Inside showCustomerPin");
		throw new IllegalStateException("Update Customer Failed");
	}
}
