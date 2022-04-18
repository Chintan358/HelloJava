package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.Category;

@Repository
@Transactional
public class CategoryDaoImpl implements CategoryDao
{
	@Autowired
    SessionFactory sessionFactory;
	
	@Override
	public void addCategory(Category cat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCategory(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Category> getAllCategory() {
		
		Session s  =sessionFactory.getCurrentSession();
		return s.createQuery("from Category").list();
	}

	@Override
	public Category getCatById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
