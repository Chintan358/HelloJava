package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao
{
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<User> getalluser() {
		
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from User").list();
	}

	@Override
	public void addUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
	}

}
