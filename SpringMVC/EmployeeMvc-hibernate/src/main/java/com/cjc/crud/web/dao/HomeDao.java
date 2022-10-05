package com.cjc.crud.web.dao;

import java.util.List;

import com.cjc.crud.web.model.Employee;

public interface HomeDao {

	
	void savedata(Employee e);
	Employee logincheck(String un, String ps);
	public List displaydata();
	Employee searchdata(Employee e);
	List searchpage(Employee e);
	Employee editdata(Employee e);
	
}
