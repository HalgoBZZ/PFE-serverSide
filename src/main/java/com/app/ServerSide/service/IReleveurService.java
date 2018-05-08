package com.app.ServerSide.service;

import java.util.List;

import com.app.ServerSide.modal.entities.Releveur;

public interface IReleveurService extends IService<Releveur, Long>{
	
	public List<Releveur> findByResponsable(String login);
	public Releveur findByLogin(String login);

}
