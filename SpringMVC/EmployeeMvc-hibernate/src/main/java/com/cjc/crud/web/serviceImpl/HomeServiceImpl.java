package com.cjc.crud.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.crud.web.dao.HomeDao;
import com.cjc.crud.web.model.Employee;
import com.cjc.crud.web.service.HomeService;

@Service
public class HomeServiceImpl  implements HomeService{
	
	
	@Autowired
	HomeDao hd;
	
	@Override
	public void savedata(Employee e) {
		
		hd.savedata(e);
	}

	@Override
	public Employee logincheck(String un, String ps) {
		
		return hd.logincheck(un, ps);
	}

	@Override
	public List displaydata() {
		
		return hd.displaydata();
	}

	@Override
	public Employee searchdata(Employee e) {
		
		return hd.searchdata(e);
	}

	@Override
	public List searchpage(Employee e) {
		
		return hd.searchpage(e);
	}

	@Override
	public Employee editdata(Employee e) {
		
		return hd.editdata(e);
	}

	
	
}
