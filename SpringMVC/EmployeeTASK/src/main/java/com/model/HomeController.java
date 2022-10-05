package com.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String login()
	{
		return "login";
	}
	List<Employee> list = new ArrayList<Employee>();
	
	@RequestMapping("/login")
	public String getData(@RequestParam ("un") String uname,@RequestParam("pw") String pass ,ModelMap m)
	{
		Employee e = new Employee();
		e.setName("Nitin");
		e.setEmail("nitin");
		e.setPass("nitin");
		e.setAge(30);
		e.setCity("Pune");
		list.add(e);
		
		m.addAttribute("list",list);
		return "list";
	}
	
}
