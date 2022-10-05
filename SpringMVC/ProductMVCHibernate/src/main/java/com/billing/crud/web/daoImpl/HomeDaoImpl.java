package com.billing.crud.web.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.billing.crud.web.dao.HomeDao;
import com.billing.crud.web.model.Product;

@Repository
public class HomeDaoImpl implements HomeDao {
	
	@Autowired
	SessionFactory sf;

	@Override
	public void saveprodata(Product p) {
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(p);
		tx.commit();
		session.close();
		
	}
	
}
