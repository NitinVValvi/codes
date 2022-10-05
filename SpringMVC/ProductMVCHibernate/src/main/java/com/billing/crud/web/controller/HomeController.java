package com.billing.crud.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.billing.crud.web.model.Product;
import com.billing.crud.web.service.HomeService;

@Controller
public class HomeController {
	@Autowired
	HomeService hs;
	
	@RequestMapping("/home")
	public String homepage()
	{
		return "home";
	}
	
	
	@RequestMapping("/product")
	public String productreg()
	{
		return "product";
	}
	
	
	@RequestMapping ("/store")
	public String postreg(@ModelAttribute Product p ,Model m)
	{
		hs.saveprodata(p);
		return "home";
	}
}
