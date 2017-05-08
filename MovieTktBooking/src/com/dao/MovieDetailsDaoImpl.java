package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.MovieDetails;

public class MovieDetailsDaoImpl implements MovieDetailsDao{

	@Override
	public boolean addmovie(MovieDetails movie) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s = sf.openSession();
		try {
			s.beginTransaction();
			MovieDetails md = movie;
			s.save(md);
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
