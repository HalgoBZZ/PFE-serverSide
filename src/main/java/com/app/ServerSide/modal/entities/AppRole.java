package com.app.ServerSide.modal.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name="Role")
@Proxy(lazy=false)
public class AppRole implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_ROLE")
	private Long ID_ROLE;
	
	@Column(name="NAME_ROLE")
	private String NAME_ROLE;

	public AppRole() {
		super();
	}

	public AppRole(Long iD_ROLE, String nAME_ROLE) {
		super();
		ID_ROLE = iD_ROLE;
		NAME_ROLE = nAME_ROLE;
	}

	public Long getID_ROLE() {
		return ID_ROLE;
	}

	public void setID_ROLE(Long iD_ROLE) {
		ID_ROLE = iD_ROLE;
	}

	public String getNAME_ROLE() {
		return NAME_ROLE;
	}

	public void setNAME_ROLE(String nAME_ROLE) {
		NAME_ROLE = nAME_ROLE;
	}



	
}
