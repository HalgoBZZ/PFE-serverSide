package com.app.ServerSide.security.domain;

import java.io.Serializable;

import org.springframework.security.core.GrantedAuthority;

public class Authority implements GrantedAuthority, Serializable{

	private static final long serialVersionUID=123456789L;
	
	private final String authority;

	public Authority(String authority) {
		this.authority = authority;
	}

	public String getAuthority() {
		return authority;
	}
	
	
}
