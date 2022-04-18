package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String start()
	{
		return "login";
	}
	
	@RequestMapping("/index")
	public String home()
	{
		return "index";
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
