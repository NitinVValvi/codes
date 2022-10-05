package com.cjc.crud.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.crud.web.model.Employee;
import com.cjc.crud.web.service.HomeService;

@Controller
public class HomeController {

	@Autowired
	HomeService hs;

	@RequestMapping("/")
	public String prelogin() {

		return "login";
	}

	@RequestMapping("/registration")
	public String preregister() {
		return "registration";
	}

	@RequestMapping("/reg")
	public String registerdata(@ModelAttribute Employee e) {
		hs.savedata(e);

		return "login";
	}

	@RequestMapping("/login")
	public String loginpage(@RequestParam("username")String un, @RequestParam("password")String ps,Model m)
	{
		System.out.println("username" + un);
		System.out.println("password" + ps);
		
		Employee e = hs.logincheck(un,ps);
		if(e!=null)
		{
			List al = hs.displaydata();
			m.addAttribute("data",al);
			return "success";
		}
		else {
		return"login";
		}
	}
	@RequestMapping("/find")
	public String findpage(@ModelAttribute Employee e)
	{
		
		hs.searchdata(e);
		
		return "search";
	} 
	
	@RequestMapping("/search")
	public String search(@ModelAttribute Employee e ,Model m )
	{
		
		List list = (List) hs.searchpage(e);
		
		if(!list.isEmpty())
		{
			m.addAttribute("li",list);
		}
		else
		{
			m.addAttribute("msg","records not found");
		}
		return "search";
	}
	
	@RequestMapping("/edit")
	public String edit(@ModelAttribute Employee e , Model m)
	{
		
		Employee em = hs.editdata(e);
		
		m.addAttribute("data", em);
		
		return "edit";
	}
	

}
