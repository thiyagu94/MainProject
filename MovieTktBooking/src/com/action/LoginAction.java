package com.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
 
import com.bean.LoginForm;
import com.dao.LoginDao;
import com.dao.LoginDaoImpl;
 
public class LoginAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        LoginForm loginForm = (LoginForm) form;
        LoginDao loginDao = new LoginDaoImpl();
        List<String> errorList = new ArrayList<String>(); 
        
        // check if username is empty 
        if (loginForm.getUserName()== null || "".equals(loginForm.getUserName().trim())){ 
        	errorList.add("Please enter UserName"); 
        	
        }
        // check if password is empty 
        if (loginForm.getPassword()== null || "".equals(loginForm.getPassword().trim())){ 
        	// set error message 
        	errorList.add("Please enter Password"); 
        }
        //check username and password in database
        if(!loginDao.checkLogin(loginForm.getUserName(), loginForm.getPassword())){
        	errorList.add("Invalid username & password"); 
        }
        if(errorList.size()>0)
        {
        	request.getSession().setAttribute("errorList", errorList);
        	return mapping.findForward("failure");
        }
        else
        {
        	return mapping.findForward("success");
        }
        
    }
 
}