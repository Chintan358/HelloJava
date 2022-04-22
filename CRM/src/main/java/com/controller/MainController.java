package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.service.RollService;

@Controller
public class MainController {

	@Autowired
	RollService rollService;
	@RequestMapping("/")
	public ModelAndView start()
	{
		ModelAndView model = new ModelAndView();
		model.addObject("roles",rollService.getRollList());
		model.setViewName("login");
		return model;
	}
	
	@RequestMapping("/admin")
	public String home()
	{
		return "admin";
	}
	
	/**********************Sales*******************************/
	
	@RequestMapping("/sales")
	public String Salehome()
	{
		return "sales";
	}
	
	
	@RequestMapping("/product")
	public String productPage()
	{
		return "product";
	}
}
