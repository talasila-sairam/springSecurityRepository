package com.programeticdispatcher.beanconf.formauth.database.bo;

public class Roles {
	protected int roleId;
	protected String roleName;

	public Roles(int roleId, String roleName) {
		
		this.roleId = roleId;
		this.roleName = roleName;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
