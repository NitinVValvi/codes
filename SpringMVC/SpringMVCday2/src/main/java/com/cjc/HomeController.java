package com.cjc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String prelogin()
	{
		System.out.println("login");
		return "login";
	}
	
	
	/*
	 * @RequestMapping("/log") public String logindata(@RequestParam("un") String
	 * uname,@RequestParam("pw") String pass) {
	 * 
	 * System.out.println("login success");
	 * System.out.println("Username is: "+uname); System.out.println("Password is:"
	 * +pass); return "success"; }
	 */
	
	
	  @RequestMapping("/log/{un}/{pw}") public String logindata(@PathVariable("un")
	  String uname,@PathVariable("pw") String pass) {
	  System.out.println("login succcess"); System.out.println("username is: "
	  +uname); System.out.println("password is: " +pass);
	  
	  return "success"; }
	 
}
