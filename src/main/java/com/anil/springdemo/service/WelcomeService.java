package com.anil.springdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService implements GenericWelcomeService
{

	public List<String> getWelcomeMessage(String name)
	{
		List<String> myWelcomeMessage= new ArrayList<>();
		myWelcomeMessage.add("Hello!");
		myWelcomeMessage.add(name);
		myWelcomeMessage.add(",Welcome to the spring course!");
		
		return myWelcomeMessage;
		
	}
}
