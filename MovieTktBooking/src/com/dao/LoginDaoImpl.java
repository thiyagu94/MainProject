package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LoginDaoImpl implements LoginDao {

	public boolean checkLogin(String userName,String password)
	{
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s = sf.openSession();
		try{
		Query qry = s.createQuery("from UserRegistration r where r.firstName=:username and r.password=:password");
		qry.setParameter("username", userName);
		qry.setParameter("password", password);
		System.out.println("username="+userName+" password="+password+"qry.list().size()="+qry.list().size());
		if((qry.list()).size() > 0)
			{
			System.out.println("aaaaaaaaaaaaaaaaaaaa");
		return true;
			}else
		return false;
	}catch(Exception e){
		System.out.println("Exception="+e);
	}
		finally {
			s.close();
		}
		return false;
	}

	@Override
	public String adminLogin(String emailId, String password) {
		
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s = sf.openSession();
		try {
			System.out.println("admin login method begins");
			Query q = s.createQuery("select m.id from TheatreAdmin m where m.emailId=:emailId and password=:password");
			q.setParameter("emailId", emailId);
			q.setParameter("password", password);
			String id =null;
			System.out.println("admin login method");
			System.out.println("q.list().size()="+q.list().size()+"email"+emailId);
			List<String> resList = q.list();
			if(resList.size()>0){
				id = resList.get(0);
				System.out.println("resList.get(0)  is "+resList.get(0));
				return id;
			}
			else
				return null;
			
		} catch (Exception e) {
			System.out.println("Exception="+e);
		}
		finally {
	         s.close(); 
	      }
		return null;
	}

}
