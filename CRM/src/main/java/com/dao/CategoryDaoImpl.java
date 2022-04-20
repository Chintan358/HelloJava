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
		
		Session s  =sessionFactory.getCurrentSession();
		s.saveOrUpdate(cat);
	}

	@Override
	public void deleteCategory(int id) {
		
		Session s  =sessionFactory.getCurrentSession();
		Category c = s.load(Category.class, id);
		s.delete(c);
	}

	@Override
	public List<Category> getAllCategory() {
		
		Session s  =sessionFactory.getCurrentSession();
		return s.createQuery("from Category").list();
	}

	@Override
	public Category getCatById(int id) {
		
		Session s  =sessionFactory.getCurrentSession();
		return s.get(Category.class, id);
	}

}
