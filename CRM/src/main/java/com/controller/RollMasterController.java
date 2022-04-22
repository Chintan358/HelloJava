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

import com.model.UserRoll;
import com.service.RollService;

@Controller
public class RollMasterController {

	@Autowired
	RollService rollService;
	
	@RequestMapping("/userrole")
	public ModelAndView UserRollPage()
	{
		ArrayList<UserRoll> al = (ArrayList<UserRoll>) rollService.getRollList();
		ModelAndView model = new ModelAndView();
		model.addObject("roles",al);
		model.addObject("userrole",new UserRoll());
		model.setViewName("userroll");
		return model;
		
	}
	
	@RequestMapping(method = RequestMethod.POST,value ="/addRole")
	public ModelAndView addUserRoll(@Valid @ModelAttribute("userrole") UserRoll role, BindingResult br)
	{
		 ModelAndView model = new ModelAndView();
		 if(br.hasErrors())
		 {
			 ArrayList<UserRoll> al = (ArrayList<UserRoll>) rollService.getRollList();
				model.addObject("UserRoll",new UserRoll());
				model.addObject("roles" ,al);
				//model.addObject("errors",br.getAllErrors());
				model.setViewName("userroll");
		 }
		 else
		 {
			 rollService.addRoll(role);
			model.setViewName("redirect:userrole");
		 }
		
		 return model;
		
	}
	
	@RequestMapping("/deleteRole")
	public String deleteCategor(@RequestParam("ctid") int ctid)
	{
		rollService.deleteRoll(ctid);
		return "redirect:userrole";
	}
	
	@RequestMapping("/updateRole")
	public ModelAndView updateUserRoll(@RequestParam("ctid") int ctid)
	{
		UserRoll ct =  rollService.getRollById(ctid);
		ArrayList<UserRoll> al = (ArrayList<UserRoll>) rollService.getRollList();
		ModelAndView model = new ModelAndView();
		model.addObject("roles",al);
		model.addObject("userrole",ct);
		model.setViewName("userroll");
		return model;
	}
	
	
}
