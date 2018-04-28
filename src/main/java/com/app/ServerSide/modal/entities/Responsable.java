package com.app.ServerSide.modal.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="Responsable")
public class Responsable extends Compte {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,mappedBy="responsable")
	private List<Releveur> releveurs=new ArrayList<Releveur>();

	
	public Responsable() {
		
	}


	public List<Releveur> getReleveurs() {
		return releveurs;
	}

	public void setReleveurs(List<Releveur> releveurs) {
		this.releveurs = releveurs;
	}
	
}
