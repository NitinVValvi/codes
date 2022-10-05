package com.cjc.crud.web.daoImpl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.crud.web.dao.HomeDao;
import com.cjc.crud.web.model.Employee;

@Repository
public class HomeDaoImpl implements HomeDao {
	
	@Autowired
	SessionFactory sf;

	@Override
	public void savedata(Employee e) {

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(e);
		tx.commit();
		session.close();

	}

	@Override
	public Employee logincheck(String un, String ps) {

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		Query query = session.createQuery("from Employee where username='" + un + "'and password = '" + ps + "'");

		Employee e = (Employee) query.uniqueResult();

		if (e != null) {
			tx.commit();
			return e;
		} else {
			System.out.println("incorrect detailss");
			System.out.println("enter correct details");
			session.close();
			return null;
		}

	}

	@Override
	public List displaydata() {

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		Criteria cr = session.createCriteria(Employee.class);

		List al = cr.list();
		tx.commit();
		session.close();
		return al;
	}

	@Override
	public Employee searchdata(Employee e) {
		
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		
		Employee emp= session.get(Employee.class, e.getId());
		tx.commit();
		session.close();
		return  emp;
	}

	@Override
	public List searchpage(Employee e) {
		
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		

		List li = session.createQuery("from Employee where city= '"+e.getCity()+"'").list();
		
		Iterator itr = li.iterator();
		while(itr.hasNext())
		{
			Employee em = (Employee)itr.next();
			if(e.getCity()==em.getCity())
			{
				Employee emp = new Employee();
				emp.setCity(em.getCity());
				emp.setId(em.getId());
				emp.setUsername(em.getUsername());
				emp.setPassword(em.getPassword());
				emp.setName(em.getName());
				emp.setMobno(em.getMobno());
				emp.setAge(em.getAge());
				emp.setEmail(em.getEmail());
				
				li.add(emp);
			}
		}
		
		
		return li;
	}

	@Override
	public Employee editdata(Employee e) {
	
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Employee emp =session.get(Employee.class,e.getId() );
		tx.commit();
		
		return emp;
	}



}
