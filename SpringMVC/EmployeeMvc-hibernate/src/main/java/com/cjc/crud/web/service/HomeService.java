package com.cjc.crud.web.service;

import java.util.List;

import com.cjc.crud.web.model.Employee;

public interface HomeService {

	void savedata(Employee e);

	Employee logincheck(String un, String ps);
	public List displaydata();

	public Employee searchdata(Employee e);

	List searchpage(Employee e);

	Employee editdata(Employee e);
	

}
