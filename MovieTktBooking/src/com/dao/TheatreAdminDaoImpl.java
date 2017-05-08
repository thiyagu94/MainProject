package com.dao;

import org.hibernate.Session;
import javax.servlet.http.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.TheatreAdmin;

public class TheatreAdminDaoImpl implements TheatreAdminDao{

	@Override
	public boolean registerTheatreAdmin(TheatreAdmin ta) {
		
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s = sf.openSession();
		try {
			s.beginTransaction();
			TheatreAdmin tAdmin = ta;
			s.save(tAdmin);
			s.getTransaction().commit();
			return true;
			
			
		} catch (Exception e) {
			System.err.println("Error creating User :" + e.getMessage());
			s.getTransaction().rollback();
			return false ;
			
		}
		finally {
			s.close();
		}
		
	}

}
