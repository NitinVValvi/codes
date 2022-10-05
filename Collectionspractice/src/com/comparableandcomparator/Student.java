package com.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student>{

	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	@Override
	public int compareTo(Student s) {
		if(id== s.id) {
			return 0;
		}else if(id>s.id) {
		return 1;
		}else {
			return -1;
		}
	
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		Student s1 = new Student(110, "Nitin");
		Student s2 = new Student(108, "Rahul");
		Student s3 = new Student(103, "Prasad");
		Student s4 = new Student(110, "Nakul");
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);

		//1 sort 
		//Collections.sort(students);
		
		//2 custom sort id using comparator
		//Collections.sort(students,new IdComparator());

		//3 custom name sort using comparator
		
		//4 same id different name but same First initial too
		
		Collections.sort(students,new IdComparator());
		System.out.println(students);
		
	}
	
	
	
}
