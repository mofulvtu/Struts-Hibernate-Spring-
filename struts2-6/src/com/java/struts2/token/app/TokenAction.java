package com.java.struts2.token.app;

import com.opensymphony.xwork2.ActionSupport;

public class TokenAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String execute() throws Exception {
		Thread.sleep(2000);
		System.out.println(userName);
		return SUCCESS;
	}

}
