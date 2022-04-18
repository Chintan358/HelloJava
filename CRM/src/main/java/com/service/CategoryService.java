package com.service;

import java.util.List;

import com.model.Category;

public interface CategoryService {

		public void addCategory(Category cat);
		public void deleteCategory(int id);
		public List<Category> getAllCategory();
		public Category getCatById(int id);
		
		
	
}
