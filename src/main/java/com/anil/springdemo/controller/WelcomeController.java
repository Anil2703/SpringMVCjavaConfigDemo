package com.anil.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anil.springdemo.service.GenericWelcomeService;
import com.anil.springdemo.service.WelcomeService;

@Controller
public class WelcomeController {
	
	@Autowired
	private GenericWelcomeService welcomeService;
	@RequestMapping
	public String doWelcome(Model model) {
		
		
		
		//WelcomeService welcomeService= new WelcomeService();
		List<String> welcomeMessage=welcomeService.getWelcomeMessage("Rocky Balboa!!!!!!!!!!!!!!!!");
		
		model.addAttribute("myWelcomeMessage",welcomeMessage);
		return "welcomeNew";
	}
	
}
