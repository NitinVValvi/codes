package com.model;

public class Employee {
	private int age;
	private String name;
	private String city;
	private long mobno;
	private String username;
	private String pass;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "Employee [getId()=" + getAge() + ", getName()=" + getName() + ", getCity()=" + getCity()
				+ ", getMobno()=" + getMobno() + ", getUsername()=" + getUsername() + ", getPass()=" + getPass() + "]";
	}
	

}
