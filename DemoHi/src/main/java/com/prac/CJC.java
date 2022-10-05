package com.prac;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CJC {
@Id
 private int roll_no;
 public int getRoll_no() {
	return roll_no;
}
public void setRoll_no(int roll_no) {
	this.roll_no = roll_no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getMarks() {
	return marks;
}
public void setMarks(float marks) {
	this.marks = marks;
}
private String name;
 private float marks;
}
