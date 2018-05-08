package com.app.ServerSide.modal.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Proxy;

import com.app.ServerSide.modal.types.TourneeState;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="Tournee")
@Proxy(lazy=false)
public class Tournee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="TOUR_ID")
	private Long TOUR_ID;
	
	@Column(name="TOUR_CODE")
	private String TOUR_CODE;
	
	@Column(name="TOUR_NAME")
	private String TOUR_NAME;
	
	@Column(name="TOUR_DURATION")
	private int TOUR_DURATION;
	
	@Column(name="TOUR_COMMENT")
	private String TOUR_COMMENT;
	
	@Temporal(TemporalType.DATE)
	@Column(name="TOUR_CREDT")
	private Date TOUR_CREDT;
	
	@Temporal(TemporalType.DATE)
	@Column(name="TOUR_UPDTDT")
	private Date TOUR_UPDTDT;
	
	@Enumerated(EnumType.STRING)
	@Column(name="TOUR_STATE")
	private TourneeState TOUR_STATE;
	
	@Temporal(TemporalType.DATE)
	@Column(name="TOUR_AFFDT")
	private Date TOUR_AFFDT;
	
	@Temporal(TemporalType.DATE)
	@Column(name="TOUR_PREVDT")
	private Date TOUR_PREVDT;
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,mappedBy="tournee")
	private List<Pdl>pdls=new ArrayList<Pdl>();
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,mappedBy="tourne")
	private List<Operation>operations=new ArrayList<Operation>(); 
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="PERE_ID")
	private List<Tournee>tournees=new ArrayList<Tournee>();
	
	@ManyToOne
	@JoinColumn(name="PERE_ID")
	private Tournee pere;
	
	@ManyToOne
	@JoinColumn(name="SEC_ID")
	private Secteur secteur;
	
	@ManyToOne
	@JoinColumn(name="REL_ID")
	private Releveur releveur;
	

	public Tournee() {
		
	}

	public Tournee(Long tOUR_ID, String tOUR_CODE, String tOUR_NAME, 
			int tOUR_DURATION, String tOUR_COMMENT, Date tOUR_CREDT, 
			Date tOUR_UPDTDT, TourneeState tOUR_STATE, Date tOUR_AFFDT, 
			Date tOUR_PREVDT) {
		TOUR_ID = tOUR_ID;
		TOUR_CODE = tOUR_CODE;
		TOUR_NAME = tOUR_NAME;
		TOUR_DURATION = tOUR_DURATION;
		TOUR_COMMENT = tOUR_COMMENT;
		TOUR_CREDT = tOUR_CREDT;
		TOUR_UPDTDT = tOUR_UPDTDT;
		TOUR_STATE = tOUR_STATE;
		TOUR_AFFDT = tOUR_AFFDT;
		TOUR_PREVDT = tOUR_PREVDT;
	}

	public Long getTOUR_ID() {
		return TOUR_ID;
	}

	public void setTOUR_ID(Long tOUR_ID) {
		TOUR_ID = tOUR_ID;
	}

	public String getTOUR_CODE() {
		return TOUR_CODE;
	}

	public void setTOUR_CODE(String tOUR_CODE) {
		TOUR_CODE = tOUR_CODE;
	}

	public String getTOUR_NAME() {
		return TOUR_NAME;
	}

	public void setTOUR_NAME(String tOUR_NAME) {
		TOUR_NAME = tOUR_NAME;
	}

	public int getTOUR_DURATION() {
		return TOUR_DURATION;
	}

	public void setTOUR_DURATION(int tOUR_DURATION) {
		TOUR_DURATION = tOUR_DURATION;
	}

	public String getTOUR_COMMENT() {
		return TOUR_COMMENT;
	}

	public void setTOUR_COMMENT(String tOUR_COMMENT) {
		TOUR_COMMENT = tOUR_COMMENT;
	}

	public Date getTOUR_CREDT() {
		return TOUR_CREDT;
	}

	public void setTOUR_CREDT(Date tOUR_CREDT) {
		TOUR_CREDT = tOUR_CREDT;
	}

	public Date getTOUR_UPDTDT() {
		return TOUR_UPDTDT;
	}

	public void setTOUR_UPDTDT(Date tOUR_UPDTDT) {
		TOUR_UPDTDT = tOUR_UPDTDT;
	}

	public TourneeState getTOUR_STATE() {
		return TOUR_STATE;
	}

	public void setTOUR_STATE(TourneeState tOUR_STATE) {
		TOUR_STATE = tOUR_STATE;
	}

	public Date getTOUR_AFFDT() {
		return TOUR_AFFDT;
	}

	public void setTOUR_AFFDT(Date tOUR_AFFDT) {
		TOUR_AFFDT = tOUR_AFFDT;
	}

	public Date getTOUR_PREVDT() {
		return TOUR_PREVDT;
	}

	public void setTOUR_PREVDT(Date tOUR_PREVDT) {
		TOUR_PREVDT = tOUR_PREVDT;
	}


	public List<Pdl> getPdls() {
		return pdls;
	}

	public void setPdls(List<Pdl> pdls) {
		this.pdls = pdls;
	}

	public List<Tournee> getTournees() {
		return tournees;
	}

	public void setTournees(List<Tournee> tournees) {
		this.tournees = tournees;
	}

	public Secteur getSecteur() {
		return secteur;
	}

	public void setSecteur(Secteur secteur) {
		this.secteur = secteur;
	}

	public Releveur getReleveur() {
		return releveur;
	}

	public void setReleveur(Releveur releveur) {
		this.releveur = releveur;
	}

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	public Tournee getPere() {
		return pere;
	}

	public void setPere(Tournee pere) {
		this.pere = pere;
	}
	

}
