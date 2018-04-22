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
@Table(name="Word")
public class Word implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="WORD_ID")
	private Long WORD_ID;
	
	@Column(name="WORD_CODE")
	private String WORD_CODE;
	
	@Column(name="WORD_NAME")
	private String WORD_NAME;
	
	@Column(name="WORD_STATUS")
	private int WORD_STATUS;
	
	@Temporal(TemporalType.DATE)
	@Column(name="WORD_CREDT")
	private Date WORD_CREDT;
	
	@Temporal(TemporalType.DATE)
	@Column(name="WORD_UPDTDT")
	private Date WORD_UPDTDT;
	
	@ManyToOne
	@JoinColumn(name="VOC_ID")
	private Vocabulaire vocabulaire;

	public Word() {
	}

	public Word(Long wORD_ID, String wORD_CODE, String wORD_NAME, 
			int wORD_STATUS, Date wORD_CREDT, Date wORD_UPDTDT) {
		WORD_ID = wORD_ID;
		WORD_CODE = wORD_CODE;
		WORD_NAME = wORD_NAME;
		WORD_STATUS = wORD_STATUS;
		WORD_CREDT = wORD_CREDT;
		WORD_UPDTDT = wORD_UPDTDT;
	}

	public Long getWORD_ID() {
		return WORD_ID;
	}

	public void setWORD_ID(Long wORD_ID) {
		WORD_ID = wORD_ID;
	}

	public String getWORD_CODE() {
		return WORD_CODE;
	}

	public void setWORD_CODE(String wORD_CODE) {
		WORD_CODE = wORD_CODE;
	}

	public String getWORD_NAME() {
		return WORD_NAME;
	}

	public void setWORD_NAME(String wORD_NAME) {
		WORD_NAME = wORD_NAME;
	}

	public int getWORD_STATUS() {
		return WORD_STATUS;
	}

	public void setWORD_STATUS(int wORD_STATUS) {
		WORD_STATUS = wORD_STATUS;
	}

	public Date getWORD_CREDT() {
		return WORD_CREDT;
	}

	public void setWORD_CREDT(Date wORD_CREDT) {
		WORD_CREDT = wORD_CREDT;
	}

	public Date getWORD_UPDTDT() {
		return WORD_UPDTDT;
	}

	public void setWORD_UPDTDT(Date wORD_UPDTDT) {
		WORD_UPDTDT = wORD_UPDTDT;
	}

	public Vocabulaire getVocabulaire() {
		return vocabulaire;
	}

	public void setVocabulaire(Vocabulaire vocabulaire) {
		this.vocabulaire = vocabulaire;
	}
	
}
