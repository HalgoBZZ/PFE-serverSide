package com.app.ServerSide.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.ServerSide.modal.entities.Releveur;
import com.app.ServerSide.modal.entities.Responsable;
import com.app.ServerSide.service.IReleveurService;


@Service
public class ReleveurService extends AbstractService<Releveur,Long> implements IReleveurService {

	@Override
	public List<Releveur> findByResponsable(Responsable responsable) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
