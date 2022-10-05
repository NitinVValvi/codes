package com.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping ("/")
	public String loginpage()
	{
		return "login";
	}
	List<Employee> list = new ArrayList<Employee>();
	
	@RequestMapping("/login")
	public String loginEmployee(@RequestParam("un")String username,@RequestParam("pw") String pass)
	{
		String admin= "admin";
		
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
		
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
	
		
		Iterator<Employee> itr = list.iterator();
		 while(itr.hasNext())
		 {
			 Employee em =itr.next();
			 
			 if(admin.equals(username)&admin.equals(pass))
			 {
				 System.out.println("age "+em.getAge());
				 System.out.println("name "+em.getName());
				 System.out.println("city "+em.getCity() );
				 System.out.println("mobno "+em.getMobno());
				 System.out.println("username "+em.getUsername());
				 System.out.println("password "+em.getPass());
				 
				 
			 }
			 else if(em.getUsername().equals(username) && em.getPass().equals(pass))
			 {
				 System.out.println("employee age "+em.getAge());
				 System.out.println("employee name "+em.getName());
				 System.out.println("employee city "+em.getCity() );
				 System.out.println("employee mobno "+em.getMobno());
				 System.out.println("username "+em.getUsername());
				 System.out.println("password "+em.getPass());
			 }
			 
		 }
		 
		
		return "list";
	}
	
	@RequestMapping("/citysearch")
	public String city(@RequestParam String city)
	{
		Employee e = new Employee();
		return "";
	}
}
