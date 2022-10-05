package com.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String prelogin()
	{
		System.out.println("login");
		return "login";
	}
	
	 @RequestMapping("/log/{un}/{pw}") 
	 public String logindata(@PathVariable("un")
	  String uname,@PathVariable("pw") String pass) 
	 {
		 System.out.println("login succcess"); 
		 System.out.println("username is: "+uname); 
		 System.out.println("password is: " +pass);
	  
		 return "success"; 
	  }
	 
	 @RequestMapping("/reg")
	 public String preregister()
	 {
		 System.out.println("this is register");
		 return "register";
	 }
	 
	 @RequestMapping("/register")
	 public String registerData(@ModelAttribute ("stu") Student s, ModelMap m)
	 {
		 System.out.println(s);
		 System.out.println(s.getUser());
		 System.out.println(s.getPass());
		 System.out.println(s.getName());
		 System.out.println(s.getMobno());
		 System.out.println(s.getAddr());
			/*
			 * m.addAttribute("data ",s.getName()); m.addAttribute("data ",s.getAddr());
			 * m.addAttribute("data ",s.getPass());
			 */
		 
		 m.addAttribute("data" ,s);
		return "success";
		 
	 }
}
