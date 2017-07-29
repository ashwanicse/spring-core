package com.spring.core.daoimpl;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.core.dao.UserDAO;
import com.spring.core.dto.User;

@Repository
public class UserDAOImpl implements UserDAO{
	
	private JdbcTemplate jdbcTemplate;
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	@Override
	public int save(User user) {
		String query = "insert into user values("+user.getId()+",'"+user.getName()+"','"+user.getDescription()+"')";
		return jdbcTemplate.update(query);
	}

	
}
