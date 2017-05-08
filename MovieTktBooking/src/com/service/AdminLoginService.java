package com.service;

import com.bean.AdminLogin;
import com.dao.LoginDaoImpl;

public class AdminLoginService {
	LoginDaoImpl loginDaoObj = new LoginDaoImpl();

	public String adminLogins(AdminLogin adminLogin) {
		String result = loginDaoObj.adminLogin(adminLogin.getEmailId(), adminLogin.getPassword());
		
		return result;
	}
	
	

}
