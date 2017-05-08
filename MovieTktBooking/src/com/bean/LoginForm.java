package com.bean;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
 
public class LoginForm extends ActionForm implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6205042093681948992L;
	private String userName = null;
    private String password = null;   

	public String getUserName() {
        return userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
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
 
}