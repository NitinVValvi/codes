package com.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

	
	  @RequestMapping("/register") 
	  public String registerUser() {
		  System.out.println("register now"); 
		  
		  return"register"; 
		  }
	 
	  @RequestMapping("/login")
	  public String loginuser()
	  {
		  System.out.println("logged in");
		  return "login";
	  }
			/*
			 * @RequestMapping("/stulist") public String studentList() { return "stulist"; }
			 */
}
