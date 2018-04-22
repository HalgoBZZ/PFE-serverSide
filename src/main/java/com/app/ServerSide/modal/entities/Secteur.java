package com.app.ServerSide.modal.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="Secteur")
public class Secteur implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SEC_ID")
	private Long SEC_ID;
	
	@Column(name="SEC_CODE")
	private String SEC_CODE;
	
	@Column(name="SEC_NAME")
	private String SEC_NAME;
	
	@Temporal(TemporalType.DATE)
	@Column(name="SEC_CREDT")
	private Date SEC_CREDT;
	
	@Temporal(TemporalType.DATE)
	@Column(name="SEC_UPDTDT")
	private Date SEC_UPDTDT;
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,mappedBy="secteur")
	private List<Tournee>tournees=new ArrayList<Tournee>();
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,mappedBy="secteur")
	private List<Planification>planifications=new ArrayList<Planification>();

	public Secteur() {
		
	}

	public Secteur(Long sEC_ID, String sEC_CODE, String sEC_NAME,
			Date sEC_CREDT, Date sEC_UPDTDT) {
		super();
		SEC_ID = sEC_ID;
		SEC_CODE = sEC_CODE;
		SEC_NAME = sEC_NAME;
		SEC_CREDT = sEC_CREDT;
		SEC_UPDTDT = sEC_UPDTDT;
	}

	public Long getSEC_ID() {
		return SEC_ID;
	}

	public void setSEC_ID(Long sEC_ID) {
		SEC_ID = sEC_ID;
	}

	public String getSEC_CODE() {
		return SEC_CODE;
	}

	public void setSEC_CODE(String sEC_CODE) {
		SEC_CODE = sEC_CODE;
	}

	public String getSEC_NAME() {
		return SEC_NAME;
	}

	public void setSEC_NAME(String sEC_NAME) {
		SEC_NAME = sEC_NAME;
	}

	public Date getSEC_CREDT() {
		return SEC_CREDT;
	}

	public void setSEC_CREDT(Date sEC_CREDT) {
		SEC_CREDT = sEC_CREDT;
	}

	public Date getSEC_UPDTDT() {
		return SEC_UPDTDT;
	}

	public void setSEC_UPDTDT(Date sEC_UPDTDT) {
		SEC_UPDTDT = sEC_UPDTDT;
	}

	public List<Tournee> getTournees() {
		return tournees;
	}

	public void setTournees(List<Tournee> tournees) {
		this.tournees = tournees;
	}

	public List<Planification> getPlanifications() {
		return planifications;
	}

	public void setPlanifications(List<Planification> planifications) {
		this.planifications = planifications;
	}
	
	
	
}
