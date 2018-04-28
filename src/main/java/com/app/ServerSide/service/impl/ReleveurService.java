package com.app.ServerSide.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ServerSide.modal.entities.Releveur;
import com.app.ServerSide.modal.entities.Responsable;
import com.app.ServerSide.repository.ReleveurRepository;
import com.app.ServerSide.service.IReleveurService;


@Service
public class ReleveurService implements IReleveurService {
	
	
	@Autowired
	private ReleveurRepository releveurRepository;

	@Override
	public List<Releveur> findByResponsable(Responsable responsable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Releveur t) {
		releveurRepository.save(t);	
	}

	@Override
	public void update(Releveur t) {
		releveurRepository.save(t);
	}

	@Override
	public void delete(Long id) {
		releveurRepository.deleteById(id);
	}

	@Override
	public List<Releveur> findAll() {
		return releveurRepository.findAll();
	}

	@Override
	public Releveur findById(Long id) {
		return releveurRepository.getOne(id);
	}

	

}
