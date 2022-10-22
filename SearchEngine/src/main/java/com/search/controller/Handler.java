package com.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Handler {

	@RequestMapping("/home")
	public String home()
	{
		System.out.println("chalra");
		return "engine";
	}
	
	@RequestMapping(path = "/search", method = RequestMethod.POST)
	public RedirectView search(@RequestParam("searchbox") String s)
	{
		RedirectView redirectView = new RedirectView();
		
		String url="https://www.google.com/search?q="+s;
		redirectView.setUrl(url);
		return redirectView;
	}
	
}
