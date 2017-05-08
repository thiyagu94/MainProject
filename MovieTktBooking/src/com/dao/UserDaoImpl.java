package com.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.UserRegistration;

public class UserDaoImpl implements UserDao{

	@Override
	public boolean registerUser(UserRegistration userRegistration) {
		
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s = sf.openSession();
		try {
			s.beginTransaction();
			UserRegistration user = userRegistration;
			s.save(user);
			s.getTransaction().commit();
			
		} catch (Exception e) {
			System.err.println("Error creating User :" + e.getMessage());
			s.getTransaction().rollback();
			return false;
		}
		return true;
	}

}
