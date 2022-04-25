package com.dao;

import java.util.List;

import com.model.User;

public interface UserDao {

	public List<User> getalluser();
	public void addUser(User user);
}
