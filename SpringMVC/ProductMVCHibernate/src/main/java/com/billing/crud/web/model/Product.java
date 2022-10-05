package com.billing.crud.web.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Product {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name="id" ,length=3)
	private int id;
	private String pname;
	private double discount;
	private double price;


	@OneToOne (cascade = CascadeType.ALL)
	@JoinColumn(name="pid")
	private Payment pay;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Payment getPay() {
		return pay;
	}


	public void setPay(Payment pay) {
		this.pay = pay;
	}
	
}
