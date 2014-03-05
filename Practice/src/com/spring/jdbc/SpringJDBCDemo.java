package com.spring.jdbc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJDBCDemo {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-JDBC.xml");
		CustomerDAO customerDAO = (CustomerDAO)ctx.getBean("customerDAO");
		
		//customerDAO.insert(new Customer(3,"Harsha",24));
		
		//customerDAO.insertByJdbcTemplate(new Customer(6,"Sachin",23));
		/*Customer cust= customerDAO.findByCustomerId(2);
		System.out.println(cust);*/
		
		/*Customer cust1 = customerDAO.findbyJdbcTemplate(1);
		System.out.println(cust1);
		
		List<Customer> custList = customerDAO.findAll("Harsha");
		System.out.println(custList);
		
		Customer cust2 = customerDAO.findbyCustomRowMapper("24");
		System.out.println(cust2);
		
		List<Customer> custList  = customerDAO.findAllByRowMapper("kuldeep");
		System.out.println(custList);
		
		String name = customerDAO.findBySingleColumn("1");
		System.out.println(name);
		
		int rows = customerDAO.findNoofRows();
		System.out.println(rows);*/
		
		
		// BATCH UPDATE 
		
		Customer customer1 = new Customer(16, "mkyong1",21);
        Customer customer3 = new Customer(14, "mkyong2",22);
        Customer customer2 = new Customer(15, "mkyong3",23);
 
        List<Customer>customers = new ArrayList<Customer>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customerDAO.insertBatch(customers);
        
		 customerDAO.batchUpdate();
        
	}
}
