package com.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	Map<String, Employee> map =new HashMap<String, Employee>();
	@RequestMapping ("/")
	public String loginpage()
	{
		return "login";
	}
	@RequestMapping("/employeess")
	public String addemployeedata()
	{
		
		Employee e1 = new Employee();
		e1.setAge(30);
		e1.setName("nitin");
		e1.setCity("pune");
		e1.setMobno(98239489429l);
		e1.setUsername("admin");
		e1.setPass("admin");
		
		Employee e2 = new Employee();
		e2.setAge(25);
		e2.setName("rahul");
		e2.setCity("pune");
		e2.setMobno(9893289429l);
		e2.setUsername("admin");
		e2.setPass("admin");
		
		Employee e3 = new Employee();
		e3.setAge(25);
		e3.setName("akshay");
		e3.setCity("pune");
		e3.setMobno(9838428889l);
		e3.setUsername("admin");
		e3.setPass("admin");
		
		Employee e4 = new Employee();
		e4.setAge(25);
		e4.setName("nikhil");
		e4.setCity("pune");
		e4.setMobno(8656789429l);
		e4.setUsername("abc");
		e4.setPass("abc");
		
		Employee e5 = new Employee();
		e5.setAge(25);
		e5.setName("mangesh");
		e5.setCity("pune");
		e5.setMobno(8928937829l);
		e5.setUsername("xyz");
		e5.setPass("xyz");
		
		Employee e6 = new Employee();
		e6.setAge(25);
		e6.setName("sumit");
		e6.setCity("pune");
		e6.setMobno(8429992429l);
		e6.setUsername("nitin");
		e6.setPass("nitin");
		
		map.put(e1.getPass(), e1);
		map.put(e2.getPass(), e2);
		map.put(e3.getPass(), e3);
		map.put(e4.getPass(), e4);
		map.put(e5.getPass(), e5);
		map.put(e6.getPass(), e6);
		
		System.out.println("employees added successfully");
		
		return"login";
		
		
	}
}


