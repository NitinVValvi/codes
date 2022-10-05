package com.cjc.crud.web.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cjc.crud.web.dao.HomeDao;
import com.cjc.crud.web.model.Student;

@Repository
public class HomeDaoImpl implements HomeDao {

	@Autowired
	SessionFactory sf;

	@Override
	public void saveData(Student s) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		session.save(s);
		tx.commit();
		session.close();

	}

	@Override
	public Student logincheck(String un, String ps) {
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		Query query = session.createQuery("from Student where username= '" + un + "' and password= '" + ps + "' ");
		Student s = (Student) query.uniqueResult();
		if (s != null) {
			tx.commit();
			return s;
		} else {
			session.close();
			return null;
		}

	}

	@Override
	public List displaydata() {

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		Criteria cr = session.createCriteria(Student.class);

		List al = cr.list();

		tx.commit();

		session.close();
		return al;
	}

	@Override
	public void deletedata(int id) {

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Query query = session.createQuery("delete Student where id= '" + id + "'");

		Student s = (Student) session.createCriteria(Student.class).add(Restrictions.eq("id", id)).uniqueResult();

		session.delete(s);
		// List al = cr.list();
		query.executeUpdate();
		tx.commit();
		System.out.println("data deleted successfully");
		session.close();

	}
	@Override
	public Student editdata(Student s) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Student stu =session.get(Student.class,s.getId() );
		tx.commit();
		
		return stu;
	}

	@Override
	public int updatedata(Student s) {
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		Query query = session.createQuery("update Student set name= '"+s.getName()+"',username= '"+s.getUsername()+"' ,password= '"+s.getPassword()+ "',mobno='"+s.getMobno()+"',email='"+s.getEmail()+"' where id= '"+s.getId()+"' ");
		int id = query.executeUpdate();
		tx.commit();
		session.close();
		return id;
		
	}
}