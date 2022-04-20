package com.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
		model.addObject("category",new Category());
		model.addObject("catdata" ,al);
		model.setViewName("category");
		return model;
		
	}
	
	@RequestMapping(method = RequestMethod.POST,value ="/addCat")
	public ModelAndView addcategory(@Valid @ModelAttribute("category") Category cat, BindingResult br)
	{
		 ModelAndView model = new ModelAndView();
		 if(br.hasErrors())
		 {
			 ArrayList<Category> al = (ArrayList<Category>) categoryService.getAllCategory();
				model.addObject("category",new Category());
				model.addObject("catdata" ,al);
				//model.addObject("errors",br.getAllErrors());
				model.setViewName("category");
		 }
		 else
		 {
			 categoryService.addCategory(cat);
			model.setViewName("redirect:category");
		 }
		
		 return model;
		
	}
	
	@RequestMapping("/deleteCat")
	public String deleteCategor(@RequestParam("ctid") int ctid)
	{
		categoryService.deleteCategory(ctid);
		return "redirect:category";
	}
	
	@RequestMapping("/updateCat")
	public ModelAndView updateCategory(@RequestParam("ctid") int ctid)
	{
		Category ct =  categoryService.getCatById(ctid);
		ArrayList<Category> al = (ArrayList<Category>) categoryService.getAllCategory();
		ModelAndView model = new ModelAndView();
		model.addObject("category",ct);
		model.addObject("catdata" ,al);
		model.setViewName("category");
		return model;
	}
	
}
