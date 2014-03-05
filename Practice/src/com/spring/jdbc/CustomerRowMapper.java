package com.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper{

	@Override
	public Object mapRow(ResultSet rs, int arg1) throws SQLException {
		Customer cust = new Customer();
		cust.setCustId(rs.getInt("CUST_ID"));
		cust.setName(rs.getString("NAME"));
		cust.setAge(rs.getInt("AGE"));
		return cust;
	}

}
