package com.app.ServerSide.modal.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="Releveur")
public class Releveur extends Compte {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="RESP_ID")
	private Responsable responsable;
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,mappedBy="releveur")
	private List<Tournee> tournees=new ArrayList<Tournee>();
	
	

	public Releveur() {
		
	}
	





	public List<Tournee> getTournees() {
		return tournees;
	}



	public void setTournees(List<Tournee> tournees) {
		this.tournees = tournees;
	}



	public Responsable getResponsable() {
		return responsable;
	}

	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}
	
	
	
}
