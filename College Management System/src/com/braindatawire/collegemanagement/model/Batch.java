package com.braindatawire.collegemanagement.model;

public class Batch {
private int bid;
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public Faculty getFaculty() {
	return faculty;
}
public void setFaculty(Faculty faculty) {
	this.faculty = faculty;
}
private String bname;
private Faculty faculty;
}
