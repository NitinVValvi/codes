package com.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {

	
	  @RequestMapping("/login") 
	  public String preLogin() {
		  System.out.println("logged in"); 
		  return"login"; 
		  }
	 
}
