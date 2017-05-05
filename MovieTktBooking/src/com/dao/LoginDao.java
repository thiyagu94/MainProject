package com.dao;

public interface LoginDao {
	public boolean checkLogin(String userName,String password);
	public String adminLogin(String emailId, String password);
}
