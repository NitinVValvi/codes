package com.cjc.crud.web.dao;

import java.util.List;

import com.cjc.crud.web.model.Student;

public interface HomeDao {

	void saveData(Student s);
	Student logincheck(String un, String ps);
	public List displaydata();
	void deletedata(int id);
	Student editdata(Student s);

	public int updatedata(Student s);

}
