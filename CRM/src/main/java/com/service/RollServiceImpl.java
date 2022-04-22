package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.RollDao;
import com.model.UserRoll;

@Service
public class RollServiceImpl implements RollService
{
	@Autowired
	RollDao rollDao;
	@Override
	public List<UserRoll> getRollList() {
		// TODO Auto-generated method stub
		return rollDao.getRollList();
	}

	@Override
	public void addRoll(UserRoll role) {
		rollDao.addRoll(role);
		
	}

	@Override
	public void deleteRoll(int rid) {
		rollDao.deleteRoll(rid);
		
	}

	@Override
	public UserRoll getRollById(int id) {
		// TODO Auto-generated method stub
		return rollDao.getRollById(id);
	}

}
