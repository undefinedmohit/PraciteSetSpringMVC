package com.springmvc;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.util.log.UserDataHelper.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Test {

	@RequestMapping("/home")
	public String home(Model model)
	{
		
		System.out.println("hello this is HOME PAGE");
		model.addAttribute("name", "Mohit Yadav");
		return "index";
		
	}
	
	@RequestMapping("/about")
	public String about(Model model)
	{
		System.out.println("this is about page");
		
		List<String> snacks= new ArrayList<String>();
		snacks.add("Maggie");
		snacks.add("Kurkure");
		snacks.add("Tedha Medha");
		snacks.add("Natkhat");
		snacks.add("Lay's");
		
		model.addAttribute("s",snacks);
		
		return "about";
	}
	
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("this is help");
		ModelAndView mv= new ModelAndView();
		mv.addObject("name", "mohit yadav");
		mv.addObject("id",24);
		LocalDateTime now = LocalDateTime.now();
		mv.addObject("d",now);
		
		
		List<Integer> list= new ArrayList<Integer>();
		list.add(12);
		list.add(11);
		list.add(17);
		list.add(19);	
		
		mv.addObject("q",list);
		mv.setViewName("help");
		return mv;
		
	}
}
