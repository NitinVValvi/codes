package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MomController {
	
	
	@RequestMapping("/food")
	public String getFood()
	{
		System.out.println("Food is available on dining table");
		return "food";
	}
}
