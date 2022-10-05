package com.cjc.crud.web.utility;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class initializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
		// TODO Auto-generated method stub
		AnnotationConfigWebApplicationContext apc=new AnnotationConfigWebApplicationContext();
		apc.register(AppConfig.class);
		apc.setServletContext(sc);
		ServletRegistration.Dynamic servlet=sc.addServlet("dispatcher", new DispatcherServlet(apc));
	servlet.addMapping("/");
		
	}
 
}