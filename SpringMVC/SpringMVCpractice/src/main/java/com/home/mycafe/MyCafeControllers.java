package com.home.mycafe;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeControllers {
	
	
	@RequestMapping("/cafe")
	public String getWelcomePage(Model model)
	{
		
		/*
		 * //sending data to view our (jsp page) String myName = "Nitin Valvi";
		 * model.addAttribute("myNameValue",myName);
		 * model.addAttribute("myWebsitetitle", "Nitin's Cafe");
		 */
		 //myName contains my data
		return "welcome-page";
	}
	
	@RequestMapping("/processorder")
	public String processOrder(HttpServletRequest request,Model model)
	{
		
		//handle data from user 
		String userEnteredValue =request.getParameter("foodtype");
		
		//adding capture value
		model.addAttribute("userInput", userEnteredValue);
		
		//set user data with the model obj and send to view
		return "processorder";
	}
}
