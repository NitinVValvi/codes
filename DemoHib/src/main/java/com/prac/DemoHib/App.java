package com.prac.DemoHib;

import org.hibernate.cfg.Configuration;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App {
	public static void main(String[] args) {
		CJC cjc = new CJC();
		cjc.setRoll_no(1);
		cjc.setName("jayesh");
		cjc.setMarks(95);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(CJC.class);
		
		SessionFactory sf  = con.buildSessionFactory();
		
		Session  session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		session.save(cjc);
	
		tx.commit();
	}
}
