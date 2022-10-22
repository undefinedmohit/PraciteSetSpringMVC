package com.register.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.register.entities.User;
import com.register.service.UserService;

@Controller
public class Handler {
	@Autowired
	private UserService userService;
	@RequestMapping("/home")
	public String Home()
	{
		return "home";
	}
	
	@RequestMapping(path = "/submitted", method = RequestMethod.POST)
	public String done(@ModelAttribute User user, Model model)
	{
		if(user.getName().isBlank())
		{
			return "redirect:/home";
		}
		System.out.println(user);
		this.userService.createUser(user);
		return "success";
		
	}

}
