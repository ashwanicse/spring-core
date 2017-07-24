package com.spring.core.daoimpl;

import com.spring.core.dao.UserDAO;

public class UserDAOImpl implements UserDAO {

	@Override
	public String getUser(){
		return "Ashwani";
	}
}
