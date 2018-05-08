package com.app.ServerSide.modal.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Proxy;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="releve")
@Proxy(lazy=false)
public class Releve implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RELE_ID")
	private Long RELE_ID;
	
	@Temporal(TemporalType.DATE)
	@Column(name="RELE_DT")
	private Date RELE_DT;
	
	@Column(name="RELE_COMMENT")
	private String RELE_COMMENT;
	
	@Temporal(TemporalType.DATE)
	@Column(name="RELE_CREDT")
	private Date RELE_CREDT;
	
	@Temporal(TemporalType.DATE)
	@Column(name="RELE_UPDTDT")
	private Date RELE_UPDTDT;
	
	@Column(name="EQU_ID")
	private Long EQU_ID;
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,mappedBy="releve")
	 private List<Vocabulaire> vocabulaires = new ArrayList<Vocabulaire>();
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,mappedBy="releve")
	private List<MesureCadran>mesures=new ArrayList<MesureCadran>();
	
	@ManyToOne
	@JoinColumn(name="PDL_ID")
	private Pdl pdl;
	
	public Releve() {
		
	}

	public Releve(Long rELE_ID, Date rELE_DT, String rELE_COMMENT, 
			Date rELE_CREDT, Date rELE_UPDTDT, Long eQU_ID) {
		RELE_ID = rELE_ID;
		RELE_DT = rELE_DT;
		RELE_COMMENT = rELE_COMMENT;
		RELE_CREDT = rELE_CREDT;
		RELE_UPDTDT = rELE_UPDTDT;
		EQU_ID = eQU_ID;
		
		
	}

	public Long getRELE_ID() {
		return RELE_ID;
	}

	public void setRELE_ID(Long rELE_ID) {
		RELE_ID = rELE_ID;
	}

	public Date getRELE_DT() {
		return RELE_DT;
	}

	public void setRELE_DT(Date rELE_DT) {
		RELE_DT = rELE_DT;
	}

	public String getRELE_COMMENT() {
		return RELE_COMMENT;
	}

	public void setRELE_COMMENT(String rELE_COMMENT) {
		RELE_COMMENT = rELE_COMMENT;
	}

	public Date getRELE_CREDT() {
		return RELE_CREDT;
	}

	public void setRELE_CREDT(Date rELE_CREDT) {
		RELE_CREDT = rELE_CREDT;
	}

	public Date getRELE_UPDTDT() {
		return RELE_UPDTDT;
	}

	public void setRELE_UPDTDT(Date rELE_UPDTDT) {
		RELE_UPDTDT = rELE_UPDTDT;
	}

	public Long getEQU_ID() {
		return EQU_ID;
	}

	public void setEQU_ID(Long eQU_ID) {
		EQU_ID = eQU_ID;
	}

	public List<Vocabulaire> getVocabulaires() {
		return vocabulaires;
	}

	public void setVocabulaires(List<Vocabulaire> vocabulaires) {
		this.vocabulaires = vocabulaires;
	}

	public List<MesureCadran> getMesures() {
		return mesures;
	}

	public void setMesures(List<MesureCadran> mesures) {
		this.mesures = mesures;
	}

	public Pdl getPdl() {
		return pdl;
	}

	public void setPdl(Pdl pdl) {
		this.pdl = pdl;
	}

}
