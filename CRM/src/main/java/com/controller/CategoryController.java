package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Category;
import com.service.CategoryService;

@Controller
public class CategoryController 
{
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("/category")
	public ModelAndView CategoryPage()
	{
		ArrayList<Category> al = (ArrayList<Category>) categoryService.getAllCategory();
		ModelAndView model = new ModelAndView();
		model.addObject("catdata" ,al);
		model.setViewName("category");
		return model;
		
	}
	
}
