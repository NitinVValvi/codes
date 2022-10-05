	package com.braindatawire.collegemanagement.serviceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.braibdatawire.collegemanagement.service.Cjc;
import com.braindatawire.collegemanagement.model.Batch;
import com.braindatawire.collegemanagement.model.Course;
import com.braindatawire.collegemanagement.model.Faculty;
import com.braindatawire.collegemanagement.model.Student;

public class Karvenagar implements Cjc
{
	List<Course> clist = new ArrayList<>();
	List<Faculty> flist = new ArrayList<>();
	List<Batch> blist = new ArrayList<>();
	List<Student> slist = new ArrayList<>();
	int count = 0;
	int count1 = 0;
	int count2 = 0;
	int count3 = 0;
	String url = "jdbc:mysql://localhost:3306/test";
	String user = "root";
	String password = "root";
	@SuppressWarnings("resource")
	public void addCourse() throws SQLException
	{
		Course c = new Course();
		
		
		 try {
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter the course id: ");
			 int cid = sc.nextInt();
			// c.setCid(cid);
			 
			 System.out.println("Enter the course name: ");
			 String cname = sc.next();
			 //c.setCname(cname);
			Class.forName("com.mysql.jdbc.Driver");
			Connection myConn = DriverManager.getConnection(url, user, password);
			String sql = "insert into college "
					+ " (course_id, course_name)" + " values (?, ?)";
			PreparedStatement myStmt = myConn.prepareStatement(sql);

			// set param values
			myStmt.setInt(1, cid);
			myStmt.setString(2, cname);
			myStmt.executeUpdate();
			System.out.println("Insert complete.");

			 clist.add(c);
			 count++;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public void viewCourse()
	{
		//Course c1 = new Course();
		if(count > 0)
		{
			Iterator<Course> itr = clist.iterator();
			while(itr.hasNext())
			{
				Course c1 = itr.next();
				System.out.println("Course details are");
				System.out.println("Course id "+c1.getCid());
				System.out.println("Course name "+c1.getCname());
			}
		}
		else
		{
			System.out.println("course not found");
		}
		
	}
	@Override
	public void addFaculty() {
		
		//@SuppressWarnings("resource")
		try {
		Scanner sc = new Scanner(System.in);
		Faculty f = new Faculty();
		System.out.println("Enter the faculty id: ");
		int fid = sc.nextInt();
	
		
		System.out.println("Enter the faculty name: ");
		String fname = sc.next();
		
		System.out.println("Enter the course name: ");
		String cname = sc.next();
		Class.forName("com.mysql.jdbc.Driver");
		Connection myConn = DriverManager.getConnection(url, user, password);
		String sql = "insert into college "
				+ " (faculty_id, faculty_name,course_name)" + " values (?, ?, ?) where course_id=101";
		PreparedStatement myStmt = myConn.prepareStatement(sql);
		ResultSet rs = myStmt.executeQuery(sql);
		myStmt.setInt(3,fid);
		myStmt.setString(4, fname);
		myStmt.setString(2,cname);
		myStmt.executeUpdate();
		rs.next();
	/*	
		Iterator<Course> itr = clist.iterator();
		while(itr.hasNext())
		{
			Course c1 = itr.next();
			if(cid == c1.getCid() )
			{
				f.setCourse(c1);
				*/

				flist.add(f);
				count1++;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	@Override
	public void viewFaculty() {
		if(count1 > 0)
		{
			Iterator<Faculty> itr = flist.iterator();
			while(itr.hasNext())
			{
				Faculty f = itr.next();
				System.out.println("Faculty details");
				System.out.println("Faculty id: "+f.getFid());
				System.out.println("Faculty name: "+f.getFname());
				System.out.println("faculty course id: "+f.getCourse().getCid());
				System.out.println("Faculty course name: "+f.getCourse().getCname());
			}
		}
		else 
		{
			System.out.println("faculty not found");
		}
	}
	@Override
	public void addBatch() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Batch b = new Batch();
		System.out.println("Enter the Batch id: ");
		int bid = sc.nextInt();
		b.setBid(bid);
		
		System.out.println("Enter the Batch name: ");
		String bname = sc.next();
		b.setBname(bname);
		
		System.out.println("Enter the faculty id: ");
		int fid = sc.nextInt();
		Iterator<Faculty> itr = flist.iterator();
		while(itr.hasNext())
		{
			Faculty f1 = itr.next();
			if(fid == f1.getFid() )
			{
				b.setFaculty(f1);
				
				blist.add(b);
				count2++;
			}
			
			
		}
		
	}
	@Override
	public void viewBatch() {
		if(count2 > 0)
		{
			Iterator<Batch> itr = blist.iterator();
			while(itr.hasNext())
			{
				Batch b = itr.next();
				System.out.println("Batch details");
				System.out.println("Batch id: "+b.getBid());
				System.out.println("Batch name: "+b.getBname());
				System.out.println("Batch faculty id: "+b.getFaculty().getFid());
				System.out.println("Batch faculty name: "+b.getFaculty().getFname());
				System.out.println("Batch faculty course id:"+b.getFaculty().getCourse().getCid());
				System.out.println("Batch faculty course name: "+b.getFaculty().getCourse().getCname());
			}
		}
	}
	@Override
	public void addStudent() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Student stu = new Student();
		System.out.println("Enter the student id: ");
		int sid = sc.nextInt();
		stu.setSid(sid);
		
		System.out.println("Enter the student name: ");
		String sname = sc.next();
		stu.setSname(sname);
		
		System.out.println("Enter the batch id: ");
		int bid = sc.nextInt();
		Iterator<Batch> itr = blist.iterator();
		while(itr.hasNext())
		{
			Batch b1 = itr.next();
			
			if(bid == b1.getBid())
			{
				stu.setBatch(b1);
				slist.add(stu);
				count3++;
			}
			
		}
	}
	@Override
	public void viewStudent() {
		if(count3 > 0)
		{
			Iterator<Student> itr =slist.iterator();
			while(itr.hasNext())
			{
				Student stu = itr.next();
				System.out.println("Student id: "+stu.getSid());
				System.out.println("student name: "+stu.getSname());
				System.out.println("Student batch id: "+stu.getBatch().getBid());
				System.out.println("Student batch name: "+stu.getBatch().getBname());
				System.out.println("Student batch faculty id: "+stu.getBatch().getFaculty().getFid());
				System.out.println("Student batch faculty name: "+stu.getBatch().getFaculty().getFname());
				System.out.println("Student course id: "+stu.getBatch().getFaculty().getCourse().getCid());
				System.out.println("Student course name: "+stu.getBatch().getFaculty().getCourse().getCname());
			}
		}
	}

}
