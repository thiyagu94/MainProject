package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.bean.UserRegistration;
import com.dao.UserDao;
import com.dao.UserDaoImpl;

public class UserRegistrationAction extends Action{
	@Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
		UserRegistration userRegistration  = (UserRegistration) form;
		UserDao userDao = (UserDao) new UserDaoImpl();
		boolean result = userDao.registerUser(userRegistration);
		if(result){
			return mapping.findForward("success");
		}
		else{
			return mapping.findForward("failure");
		}
		
		
	}


}
