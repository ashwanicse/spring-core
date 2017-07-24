package com.spring.core.service;

import com.spring.core.dao.UserDAO;

public interface UserService {

	public String getUser();
	public void setUserDAO(UserDAO userDAO);
}
