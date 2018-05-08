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
@Table(name="Vocabulaire")
@Proxy(lazy=false)
public class Vocabulaire implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="VOC_ID")
	private Long VOC_ID;
	
	@Column(name="VOC_CODE")
	private String VOC_CODE;
	
	@Column(name="VOC_NAME")
	private String VOC_NAME;
	
	@Column(name="VOC_STATUS")
	private int VOC_STATUS;
	
	@Temporal(TemporalType.DATE)
	@Column(name="VOC_CREDIT")
	private Date VOC_CREDT;
	
	@Temporal(TemporalType.DATE)
	@Column(name="VOC_UPDTDT")
	private Date VOC_UPDTDT;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL,mappedBy="vocabulaire")
	private List<Word>words=new ArrayList<Word>();
	
	@ManyToOne
	@JoinColumn(name="RELE_ID")
	private Releve releve;

	public Vocabulaire() {
		
	}

	public Vocabulaire(Long vOC_ID, String vOC_CODE, String vOC_NAME, 
			int vOC_STATUS, Date vOC_CREDT, Date vOC_UPDTDT) {
		VOC_ID = vOC_ID;
		VOC_CODE = vOC_CODE;
		VOC_NAME = vOC_NAME;
		VOC_STATUS = vOC_STATUS;
		VOC_CREDT = vOC_CREDT;
		VOC_UPDTDT = vOC_UPDTDT;
	}

	public Long getVOC_ID() {
		return VOC_ID;
	}

	public void setVOC_ID(Long vOC_ID) {
		VOC_ID = vOC_ID;
	}

	public String getVOC_CODE() {
		return VOC_CODE;
	}

	public void setVOC_CODE(String vOC_CODE) {
		VOC_CODE = vOC_CODE;
	}

	public String getVOC_NAME() {
		return VOC_NAME;
	}

	public void setVOC_NAME(String vOC_NAME) {
		VOC_NAME = vOC_NAME;
	}

	public int getVOC_STATUS() {
		return VOC_STATUS;
	}

	public void setVOC_STATUS(int vOC_STATUS) {
		VOC_STATUS = vOC_STATUS;
	}

	public Date getVOC_CREDT() {
		return VOC_CREDT;
	}

	public void setVOC_CREDT(Date vOC_CREDT) {
		VOC_CREDT = vOC_CREDT;
	}

	public Date getVOC_UPDTDT() {
		return VOC_UPDTDT;
	}

	public void setVOC_UPDTDT(Date vOC_UPDTDT) {
		VOC_UPDTDT = vOC_UPDTDT;
	}

	public List<Word> getWords() {
		return words;
	}

	public void setWords(List<Word> words) {
		this.words = words;
	}

	public Releve getReleve() {
		return releve;
	}

	public void setReleve(Releve releve) {
		this.releve = releve;
	}
	
	
}
