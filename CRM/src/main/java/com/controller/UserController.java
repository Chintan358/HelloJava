package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;
import com.model.UserRoll;
import com.service.RollService;
import com.service.UserService;

@Controller
public class UserController {

		@Autowired
		UserService userService;
		
		@Autowired
		RollService rollService;
		
		@RequestMapping("/users")
		public ModelAndView user_main()
		{
			ModelAndView model = new ModelAndView();
			List<User> alluser = userService.getalluser();
			model.addObject("roles",rollService.getRollList());
			model.addObject("userdata",alluser);
			model.addObject("users",new User());
			model.setViewName("user");
			return model;
		}
		
		@RequestMapping(method = RequestMethod.POST ,value="/addUser")
		public ModelAndView adduser(@ModelAttribute("users") User user,@RequestParam("rollid") int id)
		{
			//System.out.println(id);
			UserRoll role = rollService.getRollById(id);
			user.setUserRoll(role);
			userService.addUser(user);
			ModelAndView model = new ModelAndView();
			List<User> alluser = userService.getalluser();
			model.addObject("roles",rollService.getRollList());
			model.addObject("userdata",alluser);
			model.addObject("users",new User());
			model.setViewName("user");
			return model;
		}
}
