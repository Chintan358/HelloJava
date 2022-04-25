package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.model.User;

@Service
public class UserserviceImpl  implements UserService
{

	@Autowired
	UserDao userDao;
	
	@Override
	public List<User> getalluser() {
		return userDao.getalluser();
	}

	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}

	

}
