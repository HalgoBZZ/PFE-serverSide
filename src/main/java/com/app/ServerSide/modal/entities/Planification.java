package com.app.ServerSide.modal.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Proxy;

import com.app.ServerSide.modal.types.Day;
import com.app.ServerSide.modal.types.PlanificationState;
import com.app.ServerSide.modal.types.PlanificationType;


@Entity
@Table(name="planification")
@Proxy(lazy=false)
public class Planification implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PLANIF_ID")
	private Long PLANIF_ID;
	
	@Column(name="PLANIF_NAME")
	private String PLANIF_NAME;
	
	@Temporal(TemporalType.DATE)
	@Column(name="PLANIF_DEBDT")
	private Date PLANIF_DEBDT;
	
	@Enumerated(EnumType.STRING)
	@Column(name="PLANIF_DAY")
	private Day PLANIF_DAY;
	
	@Enumerated(EnumType.STRING)
	@Column(name="PLANiF_TYPE")
	private PlanificationType PLANIF_TYPE;
	
	@Enumerated(EnumType.STRING)
	@Column(name="PLANIF_STATE")
	private PlanificationState PLANIF_STATE;
	
	@Temporal(TemporalType.DATE)
	@Column(name="PLANIF_CREDT")
	private Date PLANIF_CREDT;
	
	@Temporal(TemporalType.DATE)
	@Column(name="PLANIF_UPDTDT")
	private Date PLANIF_UPDTDT;
	
	@Temporal(TemporalType.DATE)
	@Column(name="PLANIF_ENDDT")
	private Date PLANIF_ENDDT;

	@ManyToOne
	@JoinColumn(name="SEC_ID")
	private Secteur secteur;
	
	public Planification() {
		
	}

	public Planification(Long pLANIF_ID, String pLANIF_NAME, Date pLANIF_DT, 
			Day pLANIF_DAY, PlanificationType pLANIF_TYPE, 
			PlanificationState pLANIF_STATE, Date pLANIF_CREDT, Date pLANIF_UPDTDT,
			Date pLANIF_ENDDT) {
		PLANIF_ID = pLANIF_ID;
		PLANIF_NAME = pLANIF_NAME;
		PLANIF_DEBDT = pLANIF_DT;
		PLANIF_DAY = pLANIF_DAY;
		PLANIF_TYPE = pLANIF_TYPE;
		PLANIF_STATE = pLANIF_STATE;
		PLANIF_CREDT = pLANIF_CREDT;
		PLANIF_UPDTDT = pLANIF_UPDTDT;
		PLANIF_ENDDT = pLANIF_ENDDT;
	}

	public Long getPLANIF_ID() {
		return PLANIF_ID;
	}

	public void setPLANIF_ID(Long pLANIF_ID) {
		PLANIF_ID = pLANIF_ID;
	}

	public String getPLANIF_NAME() {
		return PLANIF_NAME;
	}

	public void setPLANIF_NAME(String pLANIF_NAME) {
		PLANIF_NAME = pLANIF_NAME;
	}

	public Date getPLANIF_DEBDT() {
		return PLANIF_DEBDT;
	}

	public void setPLANIF_DEBDT(Date pLANIF_DT) {
		PLANIF_DEBDT = pLANIF_DT;
	}

	public Day getPLANIF_DAY() {
		return PLANIF_DAY;
	}

	public void setPLANIF_DAY(Day pLANIF_DAY) {
		PLANIF_DAY = pLANIF_DAY;
	}

	public PlanificationType getPLANIF_TYPE() {
		return PLANIF_TYPE;
	}

	public void setPLANIF_TYPE(PlanificationType pLANIF_TYPE) {
		PLANIF_TYPE = pLANIF_TYPE;
	}

	public PlanificationState getPLANIF_STATE() {
		return PLANIF_STATE;
	}

	public void setPLANIF_STATE(PlanificationState pLANIF_STATE) {
		PLANIF_STATE = pLANIF_STATE;
	}

	public Date getPLANIF_CREDT() {
		return PLANIF_CREDT;
	}

	public void setPLANIF_CREDT(Date pLANIF_CREDT) {
		PLANIF_CREDT = pLANIF_CREDT;
	}

	public Date getPLANIF_UPDTDT() {
		return PLANIF_UPDTDT;
	}

	public void setPLANIF_UPDTDT(Date pLANIF_UPDTDT) {
		PLANIF_UPDTDT = pLANIF_UPDTDT;
	}

	

	public Date getPLANIF_ENDDT() {
		return PLANIF_ENDDT;
	}

	public void setPLANIF_ENDDT(Date pLANIF_ENDDT) {
		PLANIF_ENDDT = pLANIF_ENDDT;
	}

	public Secteur getSecteur() {
		return secteur;
	}

	public void setSecteur(Secteur secteur) {
		this.secteur = secteur;
	}	
	
}
