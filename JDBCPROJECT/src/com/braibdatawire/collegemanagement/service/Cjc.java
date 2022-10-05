package com.braibdatawire.collegemanagement.service;

import java.sql.SQLException;

public interface Cjc 
{
		public void addCourse() throws SQLException;
		public void viewCourse();
		public void addFaculty();
		public void viewFaculty();
		public void addBatch();
		public void viewBatch();
		public void addStudent();
		public void viewStudent();
}

