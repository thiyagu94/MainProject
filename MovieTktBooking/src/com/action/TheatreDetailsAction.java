package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;

import com.bean.TheatreDetails;
import com.dao.TheatreDetailsDao;
import com.dao.TheatreDetailsDaoImpl;

public class TheatreDetailsAction extends Action{
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response)throws Exception{
		
		TheatreDetails theatreDetails = (TheatreDetails)form;
		TheatreDetailsDao theatreDetailsDao =(TheatreDetailsDao) new TheatreDetailsDaoImpl();
		
		String theatreid = (String)request.getSession().getAttribute("theatreid");
		theatreDetails.setTheatreId(Integer.parseInt(theatreid));
		
		if(theatreDetails.getScreenNumber()<=0 || theatreDetails.getBoxSeats() <= 0 ||
				theatreDetails.getGoldSeats() <=0 || theatreDetails.getSilverSeats() <=0
				|| theatreDetails.getTheatreId() <=0){
			return mapping.findForward("failure");
		}
		else{
			boolean result = theatreDetailsDao.registerTheatreDetails(theatreDetails);
			if(result){
				return mapping.findForward("success");
			}
			else
				return mapping.findForward("failure");
		}
		
	}

}
