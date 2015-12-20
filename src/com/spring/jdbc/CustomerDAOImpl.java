package com.spring.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class CustomerDAOImpl extends JdbcDaoSupport implements CustomerDAO{

	private DataSource dataSource;
	//private JdbcTemplate jdbcTemplate;
	
	/*public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}*/

	@Override
	public void insert(Customer customer) {
		
		String sql = "INSERT INTO CUSTOMER (CUST_ID,NAME,AGE) VALUES (?,?,?)";
		Connection con = null;
		
		try{
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setLong(1,customer.getCustId());
			ps.setString(2, customer.getName());
			ps.setLong(3, customer.getAge());
			ps.executeUpdate();
			ps.close();
		}
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
		finally{
			if(con != null){
				try{
					con.close();
				}
				catch (SQLException e) {
					System.out.println("Exception occured while closing con");
				}
			}
		}
		
	}

	@Override
	public Customer findByCustomerId(int custId) {
		
		String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
		Connection con = null;
		try {
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, custId);
			
			Customer cust = null;
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				cust = new Customer(rs.getInt("CUST_ID"), rs.getString("NAME"), rs.getInt("AGE"));
			}
			rs.close();
			ps.close();
			return cust;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		finally{
			if(con != null){
				try{
					con.close();
				}
				catch (SQLException e) {
					System.out.println("Exception occured while closing con");
				}
			}
		}
	}
	
	@Override
	public void insertByJdbcTemplate(Customer customer){
		String sql = "INSERT INTO CUSTOMER (CUST_ID,NAME,AGE) VALUES (?,?,?)";
		
		//jdbcTemplate = new JdbcTemplate(dataSource);
		//jdbcTemplate.update(sql, new Object[]{customer.getCustId(),customer.getName(),customer.getAge()});
		getJdbcTemplate().update(sql, new Object[]{customer.getCustId(),customer.getName(),customer.getAge()});
	}
	
	@Override
	public Customer findbyJdbcTemplate(int custId){
		String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";
		
		//Customer cust = (Customer) getJdbcTemplate().queryForObject(sql, new Object[]{custId}, new CustomerRowMapper());
		Customer cust = (Customer) getJdbcTemplate().queryForObject(sql, new Object[]{custId}, new BeanPropertyRowMapper(Customer.class));
		return cust;
	}
	
	@Override
	public List<Customer> findAll(String name){
		String sql = "SELECT * FROM CUSTOMER WHERE NAME = ?";
		//String sql = "SELECT * FROM CUSTOMER";
		
		List<Customer> list = new ArrayList<Customer>();
		
		List<Map<String,Object>> rows = getJdbcTemplate().queryForList(sql, new Object[]{name});
		
		for(Map row:rows){
			Customer customer = new Customer();
			customer.setCustId((Long)row.get("CUST_ID"));
			customer.setName((String)row.get("NAME"));
			customer.setAge((Long)row.get("AGE"));
			list.add(customer);
		}
		return list;
	}

	public Customer findbyCustomRowMapper(String age){
		String sql = "Select * from customer where age = ?";
		Customer cust = (Customer)getJdbcTemplate().queryForObject(sql, new Object[]{age}, new CustomerRowMapper());
		
		return cust;
	}
	
	public List<Customer> findAllByRowMapper(String name){
		String sql = "Select * from customer where name = ?";
		List<Customer> custList = getJdbcTemplate().query(sql, new Object[]{name}, new BeanPropertyRowMapper(Customer.class));
		
		return custList;
	}
	
	public String findBySingleColumn(String custId){
		String sql = "select name from customer where cust_id = ?";
	//	String name = getJdbcTemplate().queryForObject(sql, new Object[]{custId},String.class);
		String name = getJdbcTemplate().queryForObject(sql,String.class ,new Object[]{custId});
		return name;
		
	}
	public int findNoofRows(){
		String sql = "select count(*) from customer";
		int rows = getJdbcTemplate().queryForInt(sql);
		return rows;
	}
	
	public void insertBatch(final List<Customer> custList){
		
		String sql = "insert into customer (cust_id,name,age) Values(?,?,?)";
		getJdbcTemplate().batchUpdate(sql, new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				Customer customer = custList.get(i);
				ps.setLong(1, customer.getCustId());
				ps.setString(2, customer.getName());
				ps.setInt(3, (int)customer.getAge());
			}
			
			@Override
			public int getBatchSize() {
				return custList.size();
			}
		});
	}
	
	public void batchUpdate(){
		String sql = "update customer set name= 'batchupdate'";
		getJdbcTemplate().batchUpdate(new String[]{sql});
		
	}
}
