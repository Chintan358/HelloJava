package com.service;

import java.util.List;

import com.model.User;

public interface UserService {
	
	public List<User> getalluser();
	public void addUser(User user);
}
