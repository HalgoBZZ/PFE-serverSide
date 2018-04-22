package com.app.ServerSide.security.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role implements Serializable {
	
	private static final long serialVersionUID=12345L;
	
	@Id
	private int ROLE_ID;
	
	private String ROLE_NAME;
	
	private List <UserRole> userRoles=new ArrayList<>();

	public Role() {
		
	}

	public int getROLE_ID() {
		return ROLE_ID;
	}

	public void setROLE_ID(int rOLE_ID) {
		ROLE_ID = rOLE_ID;
	}

	public String getROLE_NAME() {
		return ROLE_NAME;
	}

	public void setROLE_NAME(String rOLE_NAME) {
		ROLE_NAME = rOLE_NAME;
	}

	public List<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<UserRole> userRoles) {
		this.userRoles = userRoles;
	}
	
	

}
