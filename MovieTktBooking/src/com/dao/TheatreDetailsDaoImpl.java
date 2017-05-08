package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.TheatreDetails;

public class TheatreDetailsDaoImpl implements TheatreDetailsDao{

	@Override
	public boolean registerTheatreDetails(TheatreDetails td) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s = sf.openSession();
		try {
			s.beginTransaction();
			TheatreDetails theatreDetail = td;
			s.save(theatreDetail);
			s.getTransaction().commit();
			
		} catch (Exception e) {
			System.err.println("Error creating User :" + e.getMessage());
			s.getTransaction().rollback();
			return false ;
			
		}
		
		return true;
	}

}
