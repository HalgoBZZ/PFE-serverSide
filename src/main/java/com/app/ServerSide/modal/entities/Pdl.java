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
@Table(name="pdl")
@Proxy(lazy=false)
public class Pdl implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PDL_ID")
	private Long PDL_ID;
	
	@Column(name="PDL_REFE")
	private String PDL_REFE;
	
	@Column(name="PDL_COMMENT")
	private String PDL_COMMENT;
	
	@Column(name="PDL_ROUTERORDER")
	private Long PDL_ROUTERORDER;
	
	@Column(name="PDL_NEEDRDV")
	private String PDL_NEEDRDV;
	
	@Column(name="PDL_ADRESS")
	private String PDL_ADRESS;
	
	@Temporal(TemporalType.DATE)
	@Column(name="PDL_CREDT")
	private Date PDL_CREDT;
	
	@Temporal(TemporalType.DATE)
	@Column(name="PDL_UPDTDT")
	private Date PDL_UPDTDT;
	
	@Column(name="PDL_DIFFREAD")
	private String PDL_DIFFREAD;
	
	@Column(name="PDL_ACCESS")
	private String PDL_ACCESS;
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,mappedBy="pdl")
	private List<Releve>releves=new ArrayList<Releve>();

	@ManyToOne
	@JoinColumn(name="TOUR_ID")
	private Tournee tournee;
	
	public Pdl() {
		
	}

	public Pdl(Long pDL_ID, String pDL_REFE, String pDL_COMMENT, 
			Long pDL_ROUTERORDER, String pDL_NEEDRDV, String pDL_ADRESS,
			Date pDL_CREDT, Date pDL_UPDTDT, String pDL_DIFFREAD, String pDL_ACCESS) {
		PDL_ID = pDL_ID;
		PDL_REFE = pDL_REFE;
		PDL_COMMENT = pDL_COMMENT;
		PDL_ROUTERORDER = pDL_ROUTERORDER;
		PDL_NEEDRDV = pDL_NEEDRDV;
		PDL_ADRESS = pDL_ADRESS;
		PDL_CREDT = pDL_CREDT;
		PDL_UPDTDT = pDL_UPDTDT;
		PDL_DIFFREAD = pDL_DIFFREAD;
		PDL_ACCESS = pDL_ACCESS;
	}

	public Long getPDL_ID() {
		return PDL_ID;
	}

	public void setPDL_ID(Long pDL_ID) {
		PDL_ID = pDL_ID;
	}

	public String getPDL_REFE() {
		return PDL_REFE;
	}

	public void setPDL_REFE(String pDL_REFE) {
		PDL_REFE = pDL_REFE;
	}

	public String getPDL_COMMENT() {
		return PDL_COMMENT;
	}

	public void setPDL_COMMENT(String pDL_COMMENT) {
		PDL_COMMENT = pDL_COMMENT;
	}

	public Long getPDL_ROUTERORDER() {
		return PDL_ROUTERORDER;
	}

	public void setPDL_ROUTERORDER(Long pDL_ROUTERORDER) {
		PDL_ROUTERORDER = pDL_ROUTERORDER;
	}

	public String getPDL_NEEDRDV() {
		return PDL_NEEDRDV;
	}

	public void setPDL_NEEDRDV(String pDL_NEEDRDV) {
		PDL_NEEDRDV = pDL_NEEDRDV;
	}

	public String getPDL_ADRESS() {
		return PDL_ADRESS;
	}

	public void setPDL_ADRESS(String pDL_ADRESS) {
		PDL_ADRESS = pDL_ADRESS;
	}

	public Date getPDL_CREDT() {
		return PDL_CREDT;
	}

	public void setPDL_CREDT(Date pDL_CREDT) {
		PDL_CREDT = pDL_CREDT;
	}

	public Date getPDL_UPDTDT() {
		return PDL_UPDTDT;
	}

	public void setPDL_UPDTDT(Date pDL_UPDTDT) {
		PDL_UPDTDT = pDL_UPDTDT;
	}

	public String getPDL_DIFFREAD() {
		return PDL_DIFFREAD;
	}

	public void setPDL_DIFFREAD(String pDL_DIFFREAD) {
		PDL_DIFFREAD = pDL_DIFFREAD;
	}

	public String getPDL_ACCESS() {
		return PDL_ACCESS;
	}

	public void setPDL_ACCESS(String pDL_ACCESS) {
		PDL_ACCESS = pDL_ACCESS;
	}

	public List<Releve> getReleves() {
		return releves;
	}

	public void setReleves(List<Releve> releves) {
		this.releves = releves;
	}

	public Tournee getTournee() {
		return tournee;
	}

	public void setTournee(Tournee tournee) {
		this.tournee = tournee;
	}
	
	

}
