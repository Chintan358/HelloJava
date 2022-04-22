package com.service;

import java.util.List;

import com.model.UserRoll;

public interface RollService {
	
	
		public List<UserRoll> getRollList();
		public void addRoll(UserRoll role);
		public void deleteRoll(int rid);
		public UserRoll getRollById(int id);
	
	
}
