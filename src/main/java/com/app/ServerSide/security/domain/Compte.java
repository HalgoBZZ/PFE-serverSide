package com.app.ServerSide.security.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.app.ServerSide.modal.types.Sexe;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="compte")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)

public class Compte implements UserDetails, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CMPT_ID", nullable=false, updatable=false)
	protected Long CMPT_ID;
	
	@Column(name="CMPT_FIRST_NAME")
	protected String CMPT_FIRST_NAME;

	@Column(name="CMPT_LAST_NAME")
	protected String CMPT_LAST_NAME;

	@Temporal(TemporalType.DATE)
	@Column(name="CMPT_CREDT")
	protected Date CMPT_CREDT;

	@Temporal(TemporalType.DATE)
	@Column(name="CMPT_UPDTDT")
	protected Date CMPT_UPDTDT;

	@Temporal(TemporalType.DATE)
	@Column(name="CMPT_BIRTH")
	protected Date CMPT_BIRTH;

	@Column(name="CMPT_PIC")
	protected String CMPT_PIC;

	@Column(name="CMPT_PHONE")
	protected int CMPT_PHONE;

	@Column(name="CMPT_EMAIL")
	protected String CMPT_EMAIL;

	@Column(name="CMPT_PWD")
	protected String CMPT_PWD;

	@Column(name="CMPT_LOGIN",unique=true)
	protected String CMPT_LOGIN;

	@Enumerated(EnumType.STRING)
	@Column(name="CMPT_SEXE")
	protected Sexe CMPT_SEXE;
	
	@Column(name="CMPT_ENABLE")
	private boolean CMPt_ENABLE=true;
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JsonIgnore
	private List<UserRole> userRoles=new ArrayList<UserRole>();
	

	public Long getCMPT_ID() {
		return CMPT_ID;
	}

	public void setCMPT_ID(Long cMPT_ID) {
		CMPT_ID = cMPT_ID;
	}

	public String getCMPT_FIRST_NAME() {
		return CMPT_FIRST_NAME;
	}

	public void setCMPT_FIRST_NAME(String cMPT_FIRST_NAME) {
		CMPT_FIRST_NAME = cMPT_FIRST_NAME;
	}

	public String getCMPT_LAST_NAME() {
		return CMPT_LAST_NAME;
	}

	public void setCMPT_LAST_NAME(String cMPT_LAST_NAME) {
		CMPT_LAST_NAME = cMPT_LAST_NAME;
	}

	public Date getCMPT_CREDT() {
		return CMPT_CREDT;
	}

	public void setCMPT_CREDT(Date cMPT_CREDT) {
		CMPT_CREDT = cMPT_CREDT;
	}

	public Date getCMPT_UPDTDT() {
		return CMPT_UPDTDT;
	}

	public void setCMPT_UPDTDT(Date cMPT_UPDTDT) {
		CMPT_UPDTDT = cMPT_UPDTDT;
	}

	public Date getCMPT_BIRTH() {
		return CMPT_BIRTH;
	}

	public void setCMPT_BIRTH(Date cMPT_BIRTH) {
		CMPT_BIRTH = cMPT_BIRTH;
	}

	public String getCMPT_PIC() {
		return CMPT_PIC;
	}

	public void setCMPT_PIC(String cMPT_PIC) {
		CMPT_PIC = cMPT_PIC;
	}

	public int getCMPT_PHONE() {
		return CMPT_PHONE;
	}

	public void setCMPT_PHONE(int cMPT_PHONE) {
		CMPT_PHONE = cMPT_PHONE;
	}

	public String getCMPT_EMAIL() {
		return CMPT_EMAIL;
	}

	public void setCMPT_EMAIL(String cMPT_EMAIL) {
		CMPT_EMAIL = cMPT_EMAIL;
	}

	public String getCMPT_PWD() {
		return CMPT_PWD;
	}

	public void setCMPT_PWD(String cMPT_PWD) {
		CMPT_PWD = cMPT_PWD;
	}

	public String getCMPT_LOGIN() {
		return CMPT_LOGIN;
	}

	public void setCMPT_LOGIN(String cMPT_LOGIN) {
		CMPT_LOGIN = cMPT_LOGIN;
	}

	public Sexe getCMPT_SEXE() {
		return CMPT_SEXE;
	}

	public void setCMPT_SEXE(Sexe cMPT_SEXE) {
		CMPT_SEXE = cMPT_SEXE;
	}

	public boolean isCMPt_ENABLE() {
		return CMPt_ENABLE;
	}

	public void setCMPt_ENABLE(boolean cMPt_ENABLE) {
		CMPt_ENABLE = cMPt_ENABLE;
	}

	public List<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Set<GrantedAuthority> authorities=new HashSet<>();
		userRoles.forEach(ur -> authorities.add(new Authority(ur.getRole().getROLE_NAME())));
		return authorities;	
	}

	@Override
	public String getPassword() {
		return CMPT_PWD;
	}

	@Override
	public String getUsername() {
		return CMPT_LOGIN;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		return CMPt_ENABLE;
	}

	
}
