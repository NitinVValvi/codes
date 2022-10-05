package com.form.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class FormController {
	
	//@ResponseBody
	@RequestMapping("/form")
	public String getFood()
	{
		System.out.println("Form is online");
		return "form";
	}
}
