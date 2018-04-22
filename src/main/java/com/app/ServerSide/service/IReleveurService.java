package com.app.ServerSide.service;

import java.util.List;

import com.app.ServerSide.modal.entities.Releveur;
import com.app.ServerSide.modal.entities.Responsable;

public interface IReleveurService extends IService<Releveur, Long>{
	
	public List<Releveur> findByResponsable(Responsable responsable);

}
