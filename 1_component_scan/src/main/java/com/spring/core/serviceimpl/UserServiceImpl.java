package com.spring.core.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.core.dao.UserDAO;
import com.spring.core.service.UserService;

@Service // @Service: is typically used for the service layer
public class UserServiceImpl implements UserService {

	@Autowired
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
