package com.flightAdmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author Ankit
 * This controller is used to search the flights
 *
 */
@Controller
public class HomeController {

	/*
	 * This is Model Redirection - View Resolver
	 */
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String login(Model model){
		System.out.println("Inside the Controller");
		
		return "home";
	}
	
	@RequestMapping(value="/viewdata", method=RequestMethod.GET)
	public String viewSearchapi(Model model){
		System.out.println("Inside the Controller");
		
		return "viewdata";
	}
	
}
