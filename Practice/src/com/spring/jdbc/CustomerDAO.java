package com.spring.jdbc;

import java.util.List;

public interface CustomerDAO {

	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
	
	public void insertByJdbcTemplate(Customer customer);
	public Customer findbyJdbcTemplate(int custId);
	public List<Customer> findAll(String name);
	
	public Customer findbyCustomRowMapper(String age);
	public List<Customer> findAllByRowMapper(String name);
	
	public String findBySingleColumn(String custId);
	public int findNoofRows();
	
	public void insertBatch(final List<Customer> custList);
	public void batchUpdate();
}
