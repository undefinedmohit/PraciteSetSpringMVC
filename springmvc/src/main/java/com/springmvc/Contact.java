package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Contact {
	
	@RequestMapping("/contact")
	public String contact()
	{
		System.out.println("this is contact page...");
		return "signup";
	}

	@RequestMapping(path ="/data", method = RequestMethod.POST)
	public String signup(Model model, @RequestParam("email") String email, @RequestParam("name") String name, @RequestParam("password") String pass)
	
	{
			
		System.out.println(email);
		System.out.println(name);
		System.out.println(pass);
		
		model.addAttribute("e",email);
		model.addAttribute("n",name);
		model.addAttribute("p",pass);
		return "data";
	}
}
