package com.action;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.bean.AdminLogin;
import com.service.AdminLoginService;

public class AdminLoginAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("inside admin login action");
		AdminLogin adminLogin = (AdminLogin) form;
		AdminLoginService adminLoginobj = new AdminLoginService();
		HttpSession session = request.getSession();

		if(getErrors(request) ==null || getErrors(request).size() ==0){
			String theatre_id = adminLoginobj.adminLogins(adminLogin);
			if(theatre_id!=null){
				session.setAttribute("theatreid", theatre_id);
				session.setAttribute("logged-in", "true");
				return mapping.findForward("success");
			}
			else{
				
				return mapping.findForward("failure");
				
			}
		}
		else
			return mapping.findForward("failure");
		
		
		
		
		
		
		
		
		
//		LoginDao loginDao = (LoginDao) new LoginDaoImpl();
//		
//		// check if email id is empty
//		if (adminLogin.getEmailId() == null || adminLogin.getEmailId().trim().equals("")) {
//			errorList.add("Please enter Email id");
//		}
//		// check if password is empty
//		if (adminLogin.getPassword() == null || adminLogin.getPassword().trim().equals("")) {
//			errorList.add("Please enter Password");
//		}
//		String id = loginDao.adminLogin(adminLogin.getEmailId(), adminLogin.getPassword());
//		if (id=="null") {
//			errorList.add("Invalid email id & password");
//		}
//		if (errorList.size() > 0) {
//			request.getSession().setAttribute("errorList", errorList);
//			return mapping.findForward("failure");
//		}
//		else{
//			request.getSession().setAttribute("theatreid", id);
//			request.getSession().setAttribute("logged-in", "true");
//			return mapping.findForward("success");
//		}
		
		
	}

}
