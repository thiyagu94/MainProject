package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.bean.TheatreAdmin;
import com.dao.TheatreAdminDao;
import com.dao.TheatreAdminDaoImpl;

public class TheatreAdminAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		TheatreAdmin theatreAdmin = (TheatreAdmin) form;
		TheatreAdminDao theatreAdminDao = (TheatreAdminDao) new TheatreAdminDaoImpl();
		if (theatreAdmin.getEmailId() == null || theatreAdmin.getLocation() == null
				|| theatreAdmin.getMobileNumber() == null || theatreAdmin.getOwnerName() == null
				|| theatreAdmin.getPassword() == null || theatreAdmin.getTheatreName() == null
				|| theatreAdmin.getEmailId().equals("") || theatreAdmin.getLocation().equals("")
				|| theatreAdmin.getMobileNumber().equals("") || theatreAdmin.getOwnerName().equals("")
				|| theatreAdmin.getPassword().equals("") || theatreAdmin.getTheatreName().equals("")) {
			return mapping.findForward("failure");
		} 
		else {
			boolean res = theatreAdminDao.registerTheatreAdmin(theatreAdmin);
			if (res) {
				return mapping.findForward("success");
			} else {
				return mapping.findForward("failure");
			}
		}
	}
}
