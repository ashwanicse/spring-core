package com.spring.core.serviceimpl;

import com.spring.core.dao.UserDAO;
import com.spring.core.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDAO userDAO;
	@Override
	public String getUser() {		
		return userDAO.getUser();
	}
	
	@Override
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
		
	}

}
