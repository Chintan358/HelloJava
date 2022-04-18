package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CategoryDao;
import com.model.Category;

@Service
public class CategoryServiceImpl implements CategoryService
{
	@Autowired
	CategoryDao categoryDao;

	@Override
	public void addCategory(Category cat) {
		categoryDao.addCategory(cat);
		
	}

	@Override
	public void deleteCategory(int id) {
		// TODO Auto-generated method stub
		categoryDao.deleteCategory(id);
	}

	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return categoryDao.getAllCategory();
	}

	@Override
	public Category getCatById(int id) {
		// TODO Auto-generated method stub
		return categoryDao.getCatById(id);
	}

}
