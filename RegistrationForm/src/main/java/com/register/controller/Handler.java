package com.register.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Handler {
	
	@RequestMapping("/register")
	public String home()
	{
		return "home";
	}
}
