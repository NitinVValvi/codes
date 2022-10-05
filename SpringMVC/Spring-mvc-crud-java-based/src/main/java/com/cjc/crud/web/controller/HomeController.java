package com.cjc.crud.web.controller;

import com.cjc.crud.web.model.Student;
import com.cjc.crud.web.service.HomeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String registerdata(@ModelAttribute Student s) {

		hs.saveData(s);
		return "login";
	}

	@RequestMapping("/login")
	public String loginpage(@RequestParam("username") String un, @RequestParam("password") String ps, Model m) {
		System.out.println("username" + un);
		System.out.println("password" + ps);

		Student s = hs.logincheck(un, ps);
		hs.logincheck(un, ps);

		if (s != null) {
			List al = hs.displaydata();
			m.addAttribute("data", al);
			return "success";
		} else {
			System.out.println("wrong data");
			System.out.println("Enter again");
			return "login";
		}
	}

	@RequestMapping("/delete")
	public String deletedata(@RequestParam("id") int id, Model m) {
		hs.deletedata(id);
		List al = hs.displaydata();

		m.addAttribute("data", al);

		return "success";

	}
	@RequestMapping("/edit")
	public String editpage(@ModelAttribute Student s, Model m)
	{
		Student st = hs.editdata(s);
		m.addAttribute("data" ,st);
		return "edit";
	}
	
	@RequestMapping("/update")
	public String editupdatepage(@ModelAttribute("id") Student s, Model m) {
		
	
		int id  = hs.updatedata(s);

			List al = hs.displaydata();
			if(id>0) {
			m.addAttribute("data", al);
			return "success";
		} else {
			System.out.println("wrong data");
			System.out.println("Enter again");
			return "login";
		}
	}
}

