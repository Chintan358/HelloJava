package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.UserRoll;

@Repository
@Transactional
public class RollDaoImpl implements RollDao
{
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public List<UserRoll> getRollList() {
		Session s = sessionFactory.getCurrentSession();
		return s.createQuery("from UserRoll").list();
	}

	@Override
	public void addRoll(UserRoll role) {
		Session s = sessionFactory.getCurrentSession();
		s.saveOrUpdate(role);
	}

	@Override
	public void deleteRoll(int rid) {
		
		Session s = sessionFactory.getCurrentSession();
		s.delete(s.load(UserRoll.class, rid));
		
	}

	@Override
	public UserRoll getRollById(int id) {
		
		Session s = sessionFactory.getCurrentSession();
		return s.get(UserRoll.class, id);
	}

}
