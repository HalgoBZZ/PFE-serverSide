package com.app.ServerSide.modal.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.Proxy;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="Responsable")
@Proxy(lazy=false)
public class Responsable extends Compte {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy="responsable")
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
