package com.app.ServerSide.modal.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="mesureCadran")
public class MesureCadran implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MESU_CAD_ID")
	private Long MESU_CAD_ID;
	
	@Column(name="MESU_CAD_CODE")
	private String MESU_CAD_CODE;
	
	@Column(name="MESU_CAD_NAME")
	private String MESU_CAD_NAME;
	
	@Temporal(TemporalType.DATE)
	@Column(name="MESU_CAD_UPDTDT")
	private Date MESU_CAD_UPDTDT;
	
	@Temporal(TemporalType.DATE)
	@Column(name="MESU_CAD_CREDT")
	private Date MESU_CAD_CREDT;
	
	@Column(name="MES_CAD_INDEX")
	private Long MES_CAD_INDEX;
	
	@ManyToOne
	@JoinColumn(name="RELE_ID")
	private Releve releve;
	
	
	public MesureCadran() {
		
	}

	public MesureCadran(Long mESU_CAD_ID, String mESU_CAD_CODE, 
			String mESU_CAD_NAME, Date mESU_CAD_UPDT,
			Date mESU_CAD_CREDT, Long mES_CAD_VALUE) {
		MESU_CAD_ID = mESU_CAD_ID;
		MESU_CAD_CODE = mESU_CAD_CODE;
		MESU_CAD_NAME = mESU_CAD_NAME;
		MESU_CAD_UPDTDT = mESU_CAD_UPDT;
		MESU_CAD_CREDT = mESU_CAD_CREDT;
		MES_CAD_INDEX = mES_CAD_VALUE;
	}

	public Long getMESU_CAD_ID() {
		return MESU_CAD_ID;
	}

	public void setMESU_CAD_ID(Long mESU_CAD_ID) {
		MESU_CAD_ID = mESU_CAD_ID;
	}

	public String getMESU_CAD_CODE() {
		return MESU_CAD_CODE;
	}

	public void setMESU_CAD_CODE(String mESU_CAD_CODE) {
		MESU_CAD_CODE = mESU_CAD_CODE;
	}

	public String getMESU_CAD_NAME() {
		return MESU_CAD_NAME;
	}

	public void setMESU_CAD_NAME(String mESU_CAD_NAME) {
		MESU_CAD_NAME = mESU_CAD_NAME;
	}

	public Date getMESU_CAD_UPDTDT() {
		return MESU_CAD_UPDTDT;
	}

	public void setMESU_CAD_UPDTDT(Date mESU_CAD_UPDT) {
		MESU_CAD_UPDTDT = mESU_CAD_UPDT;
	}

	public Date getMESU_CAD_CREDT() {
		return MESU_CAD_CREDT;
	}

	public void setMESU_CAD_CREDT(Date mESU_CAD_CREDT) {
		MESU_CAD_CREDT = mESU_CAD_CREDT;
	}

	public Long getMES_CAD_VALUE() {
		return MES_CAD_INDEX;
	}

	public void setMES_CAD_VALUE(Long mES_CAD_VALUE) {
		MES_CAD_INDEX = mES_CAD_VALUE;
	}

	public Long getMES_CAD_INDEX() {
		return MES_CAD_INDEX;
	}

	public void setMES_CAD_INDEX(Long mES_CAD_INDEX) {
		MES_CAD_INDEX = mES_CAD_INDEX;
	}

	public Releve getReleve() {
		return releve;
	}

	public void setReleve(Releve releve) {
		this.releve = releve;
	}

	
}
