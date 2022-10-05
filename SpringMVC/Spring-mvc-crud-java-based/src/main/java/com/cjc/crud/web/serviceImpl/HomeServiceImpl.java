package com.cjc.crud.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.crud.web.dao.HomeDao;
import com.cjc.crud.web.model.Student;
import com.cjc.crud.web.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeDao hd;

	@Override
	public void saveData(Student s) {
		hd.saveData(s);
		
	}

	@Override
	public Student logincheck(String un, String ps) {
		
		return hd.logincheck(un, ps);
		
	}

	@Override
	public List displaydata() {
	
		return hd.displaydata();
	}

	@Override
	public void deletedata(int id) {
		hd.deletedata(id);
		
	}


	

	@Override
	public Student editdata(Student s) {
		
		return hd.editdata(s);
	}

	@Override
	public int updatedata(Student s) {
		return hd.updatedata(s);
	
		
	}

}
