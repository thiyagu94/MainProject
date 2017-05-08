package com.bean;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class AdminLogin extends ActionForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2684272288001446188L;
	private String emailId;
	private String password;
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
    public void reset(ActionMapping mapping, HttpServletRequest request){
    	this.password = null;
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request){
		
		ActionErrors errors = new ActionErrors();
		if(this.emailId == null || this.emailId.trim().equals("")){
			errors.add("emailId", new ActionMessage("errors.required","EmailId"));
		}
		if(this.password ==null || this.password.trim().equals("")){
			errors.add("password", new ActionMessage("errors.required", "Password"));
		}
		return errors;
	}
	
	
}
