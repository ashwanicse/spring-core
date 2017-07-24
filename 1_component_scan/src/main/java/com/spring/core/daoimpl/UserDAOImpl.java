package com.spring.core.daoimpl;

import org.springframework.stereotype.Repository;

import com.spring.core.dao.UserDAO;

@Repository    //@Repository: is typically used for the repository layer
public class UserDAOImpl implements UserDAO {

	@Override
	public String getUser(){
		return "Ashwani";
	}
}
