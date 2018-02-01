package com.programeticdispatcher.beanconf.formauth.database.bo;

public class User {
	protected int userNo;
	protected String username;
	protected String password;
	protected String status;
	protected Roles userRoles;

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Roles getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Roles userRoles) {
		this.userRoles = userRoles;
	}
}
